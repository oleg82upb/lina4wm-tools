package de.upb.lina.cfg.controlflow.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowLocationEditPart;
import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes;
import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowModelingAssistantProvider;

/**
 * @generated
 */
public class ControlFlowModelingAssistantProviderOfControlFlowLocationEditPart extends
		ControlFlowModelingAssistantProvider
{

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source)
	{
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ControlFlowLocationEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ControlFlowLocationEditPart source)
	{
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ControlFlowElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target)
	{
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ControlFlowLocationEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ControlFlowLocationEditPart source,
			IGraphicalEditPart targetEditPart)
	{
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ControlFlowLocationEditPart)
		{
			types.add(ControlFlowElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType)
	{
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ControlFlowLocationEditPart) sourceEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ControlFlowLocationEditPart source, IElementType relationshipType)
	{
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ControlFlowElementTypes.Transition_4001)
		{
			types.add(ControlFlowElementTypes.ControlFlowLocation_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target)
	{
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ControlFlowLocationEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ControlFlowLocationEditPart target)
	{
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ControlFlowElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType)
	{
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ControlFlowLocationEditPart) targetEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ControlFlowLocationEditPart target, IElementType relationshipType)
	{
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ControlFlowElementTypes.Transition_4001)
		{
			types.add(ControlFlowElementTypes.ControlFlowLocation_2001);
		}
		return types;
	}

}
