package de.upb.llvm_parser.naming;

import java.util.List;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;

public class LLVMQualifiedNameConverter implements IQualifiedNameConverter {

	public String toString(QualifiedName qualifiedName)
	{
		if (qualifiedName == null)
			throw new IllegalArgumentException("Qualified name cannot be null");
		return qualifiedName.toString(getDelimiter());
	}

	public QualifiedName toQualifiedName(String qualifiedNameAsString)
	{
		if (qualifiedNameAsString == null)
			throw new IllegalArgumentException("Qualified name cannot be null");
		if (qualifiedNameAsString.equals(""))
			throw new IllegalArgumentException("Qualified name cannot be empty");
		if (Strings.isEmpty(getDelimiter()))
			return QualifiedName.create(qualifiedNameAsString);
		List<String> segs = getDelimiter().length() == 1 ? Strings.split(qualifiedNameAsString, getDelimiter()
				.charAt(0)) : Strings.split(qualifiedNameAsString, getDelimiter());
	    return QualifiedName.create(segs);
	}
	
	
	public String getDelimiter() {
		return "-";
	}

}
