package de.upb.lina.transformations.logic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.ecore.EObject;

import de.upb.lina.transformations.kiv.GenerateKIVspec;
import de.upb.lina.transformations.kiv.GenerateKIVspecGlobal;
import de.upb.lina.transformations.promela.GenerateOperationalPromelaModel;
import de.upb.lina.transformations.promela.GeneratePromelaModel;

public enum ETransformationType {
	PROMELA("promela", 0) {
		@Override
		public AbstractAcceleoGenerator createAcceleoGenerator(EObject model,
				File targetFolder, List<? extends Object> arguments) throws IOException{
			return new GeneratePromelaModel(model, targetFolder, arguments);
		}
	},
	PROMELA_OPERATIONAL("promela_operational", 3) {
		@Override
		public AbstractAcceleoGenerator createAcceleoGenerator(EObject model,
				File targetFolder, List<? extends Object> arguments) throws IOException{
			return new GenerateOperationalPromelaModel(model, targetFolder, arguments);
		}
	}, 
	KIV_LOCAL("kiv_local", 1) {
		@Override
		public AbstractAcceleoGenerator createAcceleoGenerator(EObject model,
				File targetFolder, List<? extends Object> arguments) throws IOException{
			return new GenerateKIVspec(model, targetFolder, arguments);
		}
	}, 
	KIV_GLOBAL("kiv_global", 2) {
		@Override
		public AbstractAcceleoGenerator createAcceleoGenerator(EObject model,
				File targetFolder, List<? extends Object> arguments) throws IOException{
			return new GenerateKIVspecGlobal(model, targetFolder, arguments);
		}
	};
	
	private String identifier;
	private int id;
	
	private ETransformationType(String identifier, int id){
		this.identifier = identifier;
		this.id = id;
	}
	
	public abstract AbstractAcceleoGenerator createAcceleoGenerator(EObject model, File targetFolder,
            List<? extends Object> arguments) throws IOException;
	
	public static ETransformationType[] getTransformationTypes(){
		return ETransformationType.values();
	}
	
	public static ETransformationType getTransformationTypeById(int id){
		for(ETransformationType transformationType: getTransformationTypes()){
			if(transformationType.getId() == id){
				return transformationType;
			}
		}
		return null;
	}
	
	public static List<ETransformationType> getPromelaTransformationTypes(){
		return getTransformationTypesWhereIdentifierStartsWith("promela");
	}
	
	public static List<ETransformationType> getKivTransformationTypes(){
		return getTransformationTypesWhereIdentifierStartsWith("kiv");
	}
	
	private static List<ETransformationType> getTransformationTypesWhereIdentifierStartsWith(String prefix){
		List<ETransformationType> filteredTransformationTypes = new ArrayList<ETransformationType>();
		for(ETransformationType transformationType: getTransformationTypes()){
			if(transformationType.getIdentifier().startsWith(prefix)){
				filteredTransformationTypes.add(transformationType);
			}
		}
		return filteredTransformationTypes;
	}

	public String getIdentifier() {
		return identifier;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean isKivTransformation(){
		return identifier.startsWith("kiv");
	}
	
	public boolean isPromelaTransformation(){
		return identifier.startsWith("promela");
	}
	
}
