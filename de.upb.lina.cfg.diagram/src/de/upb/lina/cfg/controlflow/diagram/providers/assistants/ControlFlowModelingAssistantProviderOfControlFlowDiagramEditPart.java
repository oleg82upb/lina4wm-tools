package de.upb.lina.cfg.controlflow.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes;
import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowModelingAssistantProvider;

/**
 * @generated
 */
public class ControlFlowModelingAssistantProviderOfControlFlowDiagramEditPart
		extends ControlFlowModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ControlFlowElementTypes.ControlFlowLocation_2001);
		return types;
	}

}
