package de.upb.lina.cfg.controlflow.diagram.providers;

import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.providers.TopDownProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNodeOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

public class ControlFlowLayoutProvider extends TopDownProvider {

	public static String DEFAULT_LAYOUT = "Default";
	public static String CFG = "ControlFlow";

	public ControlFlowLayoutProvider() {
		super();
	}

	public boolean provides(IOperation operation) {
		// enable this provider only on control flow diagrams
		if (operation instanceof ILayoutNodeOperation) {
			Iterator<?> nodes = ((ILayoutNodeOperation) operation)
					.getLayoutNodes().listIterator();
			if (nodes.hasNext()) {
				View node = ((ILayoutNode) nodes.next()).getNode();
				Diagram container = node.getDiagram();
				if (container == null
						|| !(container.getType().equals(CFG))) //$NON-NLS-1$
					return false;
			}
		} else {
			return false;
		}
		IAdaptable layoutHint = ((ILayoutNodeOperation) operation)
				.getLayoutHint();
		String layoutType = (String) layoutHint.getAdapter(String.class);
		return LayoutType.DEFAULT.equals(layoutType);
	}
}
