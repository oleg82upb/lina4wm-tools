package de.upb.llvm_parser;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class STRINGValueConverter extends AbstractValueConverter<String> {
	public String toString(String value) {
		if (value == null)
			throw new ValueConverterException("STRING-value may not be null.", null, null);
		return '"' + Strings.convertToJavaString(value, false) + '"';
	}

	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		if (string == null)
			return null;
		try {
			return string.substring(1, string.length() - 1); // return value of
																// string
																// (without '"')
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}
}
