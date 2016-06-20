package de.upb.lina.cfg.tools.stringrepresentation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.EMemoryModel;
import de.upb.lina.cfg.tools.StringUtils;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Aggregate_Type;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.DecimalConstant;
import de.upb.llvm_parser.llvm.FunctionParameter;
import de.upb.llvm_parser.llvm.FunctionType;
import de.upb.llvm_parser.llvm.IntegerConstant;
import de.upb.llvm_parser.llvm.NestedCast;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.Vector;


public class StringConversionManager {

   private final static String REPLACE_STRINGS_REGEX = "\\s|\"|@_|@|%";
   private final static Pattern REPLACE_PATTERN = Pattern.compile(REPLACE_STRINGS_REGEX);
   private final static Pattern REPLACE_DOT_PATTERN = Pattern.compile(StringUtils.REPLACE_DOTS_REGEX);

   private Map<EObject, String> eObjectToStringCache;
   private Map<String, String> llvmToCleanedNameCache;


   public StringConversionManager() {
      eObjectToStringCache = new HashMap<EObject, String>();
      llvmToCleanedNameCache = new HashMap<String, String>();
   }


   /**
    * Deletes any strange symbols used in LLVM code such as {@code @} or {@code %} from the given
    * string. If the string only consists of numbers after this procedure, a 'v' will be
    * concatenated in front of the number. The resulting string is returned.
    * 
    * @param string the string to clean
    * @return the result of the clean operation
    */
   public String clean(String string) {
      if (llvmToCleanedNameCache.containsKey(string)) {
         return llvmToCleanedNameCache.get(string);
      }

      // TODO: determine whether the patterns cause any problems
      // unless nothing strange happens all of a sudden, we can delete the commented code soon
      // int loc = string.indexOf("%");
      // if the address is starts with a number, do not give it a v_
      // if (loc > -1 && string.substring(loc + 1, loc + 2).matches("[0-9]")) {
      // string = string.replaceAll("%", "v");
      // } else {
      // string = string.replaceAll("%", "");
      // }
      // string = string.trim();
      boolean needsVariablePrefix = string.contains("%");
      string = REPLACE_PATTERN.matcher(string).replaceAll(StringUtils.EMPTY_STRING);
      string = REPLACE_DOT_PATTERN.matcher(string).replaceAll("_");
      // old string.replaceAll(REPLACE_STRINGS_REGEX, EMPTY_STRING);
      if (needsVariablePrefix && string.matches(StringUtils.NUMBERS_REGEX)) {
         string = "v".concat(string);
      }
      // string = string.replaceAll("\"", "");
      // string = string.replaceAll("\\.", "_");

      // if the address is starts with a number, do not give it a v_
      // string = string.replaceAll("@_", "");

      // string = string.replaceAll("@", "");

      return string;
   }


   /**
    * Creates the string representation of the given address.
    * 
    * @param adress the address to represent
    * @return the string representation of the given address
    */
   public String addressToString(Address adress) {
      return clean(adress.getName());
   }


   /**
    * Creates the string representation of the given value.
    * 
    * @param value the value to represent
    * @return the string representation of the given value
    */
   public String valueToString(Value value) {
      String result = valueToLLVMString(value);
      return clean(result);
   }


   /**
    * Creates the string representation of the given type.
    * 
    * @param type the type to represent
    * @return the string representation of the given type
    */
   public String typeToString(EObject type) {
      if (type instanceof TypeUse) {
         return typeUseToString((TypeUse) type);
      } else if (type instanceof Aggregate_Type) {
         return aggregateTypeToString((Aggregate_Type) type);
      }
      return "";
   }


   /**
    * Creates the LLVM string representation of the given value.
    * 
    * @param value the value to be represented
    * @return the LLVM string representation of the given value
    */
   public String valueToLLVMString(Value value) {
      if (isCached(value)) {
         return getCacheEntryFor(value);
      }

      StringBuilder stringBuilder = new StringBuilder();

      if (value instanceof AddressUse) {
         AddressUse addressUse = (AddressUse) value;
         stringBuilder.append(addressUse.getAddress().getName());
      } else if (value instanceof IntegerConstant) {
         stringBuilder.append(((IntegerConstant) value).getValue());
      } else if (value instanceof DecimalConstant) {
         stringBuilder.append(((DecimalConstant) value).getValue());
      } else if (value instanceof PrimitiveValue) {
         stringBuilder.append(((PrimitiveValue) value).getValue());
      } else if (value instanceof NestedGetElementPtr) {
         // TODO indices are missing and actually a simple representation
         return "(GetElementPtr" + StringUtils.WHITESPACE_SINGLE + parameterValueToString(((NestedGetElementPtr) value).getAggregate())
               + StringUtils.RIGHT_BRACKET;
      } else if (value instanceof NestedCast) {
         NestedCast val = (NestedCast) value;
         stringBuilder.append(StringUtils.LEFT_BRACKET);
         stringBuilder.append(typeToString(val.getFrom()));
         stringBuilder.append("-->");
         stringBuilder.append(typeToString(val.getTo()));
         stringBuilder.append(StringUtils.RIGHT_BRACKET);
         stringBuilder.append(valueToString(val.getValue()));
      } else {
         stringBuilder.append(CFGConstants.TODO);
      }

      stringBuilder.append(StringUtils.WHITESPACE_SINGLE);

      String stringRepresentation = stringBuilder.toString();
      addCacheEntry(value, stringRepresentation);
      return stringRepresentation;
   }


   /**
    * Creates the string representation of the given aggregate type.
    * 
    * @param aggregateType the aggregate type to represent
    * @return the string representation of the given aggregate type
    */
   public String aggregateTypeToString(Aggregate_Type aggregateType) {
      if (isCached(aggregateType)) {
         return getCacheEntryFor(aggregateType);
      }

      StringBuilder stringBuilder = new StringBuilder();
      if (aggregateType instanceof Array) {
         Array array = (Array) aggregateType;
         EObject arrayType = array.getType();
         stringBuilder = new StringBuilder("[");
         stringBuilder.append(array.getLength());
         stringBuilder.append(" x ");
         stringBuilder.append(typeToString(arrayType));
         stringBuilder.append("]");
         if (array.getPointer() != null) {
            stringBuilder.append(array.getPointer());
         }
      } else if (aggregateType instanceof Vector) {
         Vector vector = (Vector) aggregateType;
         EObject vectorType = vector.getType();

         stringBuilder = new StringBuilder("[");
         stringBuilder.append(vector.getLength());
         stringBuilder.append(" x ");
         stringBuilder.append(typeToString(vectorType));
         stringBuilder.append("]");
      } else if (aggregateType instanceof Structure) {
         Structure struct = (Structure) aggregateType;
         stringBuilder = new StringBuilder("{");
         EList<EObject> types = struct.getTypes();
         Iterator<EObject> typeIterator = types.iterator();
         while (typeIterator.hasNext()) {
            stringBuilder.append(typeToString(typeIterator.next()));
            if (typeIterator.hasNext()) {
               stringBuilder.append(", ");
            }
         }
         if (struct.getPointer() != null) {
            stringBuilder.append(struct.getPointer());
         }
         stringBuilder.append("}");
      }

      String stringRepresentation = stringBuilder.toString();
      addCacheEntry(aggregateType, stringRepresentation);
      return stringRepresentation;
   }


   /**
    * Creates the string representation of the value of the given parameter.
    * 
    * @param parameter the parameter hosting the value to represent
    * @return the string representation of the value of the given parameter
    */
   public String parameterValueToString(Parameter parameter) {
      return valueToString(parameter.getValue());
   }


   /**
    * Creates the string representation of the given type use.
    * 
    * @param typeUse the type use to be represented as a string
    * @return the string representation of the given type use
    */
   public String typeUseToString(TypeUse typeUse) {
      if (isCached(typeUse)) {
         return getCacheEntryFor(typeUse);
      }

      StringBuilder stringBuilder = new StringBuilder();
      if (typeUse instanceof Predefined) {
         Predefined predefinedTypeUse = (Predefined) typeUse;
         stringBuilder = new StringBuilder(predefinedTypeUse.getType());
         if (predefinedTypeUse.getPointer() != null) {
            stringBuilder.append(predefinedTypeUse.getPointer());
         }
      } else if (typeUse instanceof AddressUse) {
         AddressUse addressUse = (AddressUse) typeUse;
         stringBuilder = new StringBuilder(addressUse.getAddress().getName());
         if (addressUse.getPointer() != null) {
            stringBuilder.append(addressUse.getPointer());
         }
      } else if (typeUse instanceof FunctionType) {
         FunctionType ftype = (FunctionType) typeUse;
         stringBuilder = new StringBuilder(typeToString(ftype.getReturnType()));
         stringBuilder.append(StringUtils.LEFT_BRACKET);
         Iterator<FunctionParameter> i = ftype.getParameter().getParams().iterator();
         while (i.hasNext()) {
            stringBuilder.append(typeToString(i.next()));
            if (i.hasNext()) {
               stringBuilder.append(", ");
            }
         }
         stringBuilder.append(StringUtils.RIGHT_BRACKET);
      } else {
         stringBuilder.append(typeUse.toString());
      }
      String stringRepresentation = stringBuilder.toString();
      addCacheEntry(typeUse, stringRepresentation);
      return stringRepresentation;
   }


   /**
    * Creates the string representation of the given parameter list.
    * 
    * @param parameterList the parameter list to create the string representation of
    * @return the string representation of the given parameter list
    */
   public String parameterListToString(ParameterList parameterList) {
      if (isCached(parameterList)) {
         return getCacheEntryFor(parameterList);
      }
      StringBuffer stringBuffer = new StringBuffer(StringUtils.LEFT_BRACKET);
      Iterator<Parameter> parameterIterator = parameterList.getParams().iterator();
      while (parameterIterator.hasNext()) {
         Parameter parameter = parameterIterator.next();
         stringBuffer.append(parameterValueToString(parameter));
         if (parameterIterator.hasNext()) {
            stringBuffer.append(", ");
         }
      }
      stringBuffer.append(StringUtils.RIGHT_BRACKET);

      String stringRepresentation = stringBuffer.toString();
      addCacheEntry(parameterList, stringRepresentation);
      return stringRepresentation;
   }


   /**
    * Returns the string representation of the given store buffer graph node under the given memory
    * model.
    * 
    * @param node the store buffer graph node to represent as a string
    * @return the string representation of the given store buffer graph node under the given memory
    *         model
    */
   public String bufferToString(ControlFlowLocation node, EMemoryModel memoryModel) {
      return bufferToString(node.getBuffer(), node.getPc(), memoryModel);
   }


   /**
    * Returns the string representation of the store buffer graph node constructed from the given pc
    * and store buffer under the given memory model.
    * 
    * @param pc the pc to use to construct a store buffer graph node
    * @param storeBuffer the store buffer to use to construct a store buffer graph node
    * @param memoryModel the memory model to consider
    * @return the string representation of given store buffer graph node constructed from the given
    *         pc and store buffer under the given memory model
    */
   public String bufferToString(StoreBuffer storeBuffer, int pc, EMemoryModel memoryModel) {

      StringBuilder stringBuilder = new StringBuilder(CFGConstants.PC_PREFIX);
      stringBuilder.append(pc);

      if (storeBuffer.getAddressValuePairs().isEmpty()) {
         return stringBuilder.toString();
      }

      stringBuilder.append(" <");
      if (memoryModel == EMemoryModel.SC || memoryModel == EMemoryModel.TSO) {

         Iterator<AddressValuePair> addressValuePairIterator = storeBuffer.getAddressValuePairs().iterator();
         while (addressValuePairIterator.hasNext()) {
            stringBuilder.append(StringUtils.LEFT_BRACKET);
            stringBuilder.append(addressValuePairToString(addressValuePairIterator.next()));
            stringBuilder.append(StringUtils.RIGHT_BRACKET);
            if (addressValuePairIterator.hasNext()) {
               stringBuilder.append(", ");
            }
         }
      } else if (memoryModel == EMemoryModel.PSO) {
         // TODO improve this, by sorting the the addressvaluepairs directly, using a
         // comparator
         // entries will be represented in alphabetical order
         ArrayList<String> addressNamesInStoreBuffer = new ArrayList<String>();

         for (AddressValuePair addressValuePair : storeBuffer.getAddressValuePairs()) {
            Value addressValue = addressValuePair.getAddress().getValue();
            String addressName = valueToLLVMString(addressValue);
            if (!addressNamesInStoreBuffer.contains(addressName)) {
               addressNamesInStoreBuffer.add(addressName);
            }
         }

         Collections.sort(addressNamesInStoreBuffer, String.CASE_INSENSITIVE_ORDER);

         // Create representation in sorted order
         Iterator<String> addressNameIterator = addressNamesInStoreBuffer.iterator();
         while (addressNameIterator.hasNext()) {
            String addressName = addressNameIterator.next();
            for (AddressValuePair addressValuePair : storeBuffer.getAddressValuePairs()) {
               Value addressValue = addressValuePair.getAddress().getValue();
               if (addressName.equals(valueToLLVMString(addressValue))) {
                  stringBuilder.append(StringUtils.LEFT_BRACKET);
                  stringBuilder.append(addressValuePairToString(addressValuePair));
                  stringBuilder.append(StringUtils.RIGHT_BRACKET);
                  if (addressNameIterator.hasNext()) {
                     stringBuilder.append(", ");
                  }
               }
            }
         }

      } else {
         stringBuilder.append("not specified");
      }

      stringBuilder.append(">");
      return stringBuilder.toString();
   }


   /**
    * Returns the string representation of the given address value pair.
    * 
    * @param addressValuePair the address value pair to represent as a string
    * @return the string representation of the given address value pair
    */
   public String addressValuePairToString(AddressValuePair addressValuePair) {
      if (isCached(addressValuePair)) {
         return getCacheEntryFor(addressValuePair);
      }
      StringBuilder stringBuilder = new StringBuilder(valueToString(addressValuePair.getAddress().getValue()));
      stringBuilder.append(": ");
      Iterator<Parameter> parameterIterator = addressValuePair.getValues().iterator();
      while (parameterIterator.hasNext()) {
         Parameter parameter = parameterIterator.next();
         stringBuilder.append(valueToString(parameter.getValue()));
         if (parameterIterator.hasNext()) {
            stringBuilder.append(", ");
         }
      }
      String stringRepresentation = stringBuilder.toString();
      addCacheEntry(addressValuePair, stringRepresentation);
      return stringRepresentation;
   }


   private void addCacheEntry(EObject eObject, String stringRepresentationOfEObject) {
      eObjectToStringCache.put(eObject, stringRepresentationOfEObject);
   }


   private boolean isCached(EObject eObject) {
      return eObjectToStringCache.containsKey(eObject);
   }


   private String getCacheEntryFor(EObject eObject) {
      return eObjectToStringCache.get(eObject);
   }

}
