package de.upb.lina.cfg.controlflow.diagram.providers;

import de.upb.lina.cfg.controlflow.diagram.part.ControlFlowDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers
{

	protected ElementInitializers()
	{
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance()
	{
		ElementInitializers cached = ControlFlowDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null)
		{
			ControlFlowDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
