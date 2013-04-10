/**
 * 
 */
package de.upb.lina.cfg.controlflow.diagram.providers;

import de.upb.lina.cfg.controlflow.diagram.edit.parts.CustomControlFlowEditPartFactory;

/**
 * @author Oleg Travkin
 *
 */
public class CustomControlFlowEditPartProvider extends
		ControlFlowEditPartProvider {

	/**
	 * 
	 */
	public CustomControlFlowEditPartProvider() {
		super();
		setFactory(new CustomControlFlowEditPartFactory());
	}

}
