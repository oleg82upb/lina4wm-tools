package de.upb.lina.cfg.controlflow.diagram.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.Store;

public class CustomControlFlowViewProvider extends ControlFlowViewProvider
{
	private final static RGB READ = new RGB(0, 200, 0);
	private final static RGB WRITE = new RGB(200, 0, 0);
	private final static RGB CAS = new RGB(0, 200, 200);
	private final static RGB FENCE = new RGB(0, 0, 200);
	private final static RGB ALLOCA = new RGB(200, 200, 0);
	private final static RGB FLUSH = new RGB(100, 0, 0);
	private final static RGB END_NODE = new RGB(171, 182, 242);
	
	/**
	 * @generated
	 */
	public Edge createTransition_4001(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint)
	{
		Edge edge = super.createTransition_4001(domainElement, containerView, index, persisted, preferencesHint);
		LineStyle style = (LineStyle) edge.getStyle(NotationPackage.Literals.LINE_STYLE);

		if (style == null)
		{
			return edge;
		}

		EObject transitionElement = ((Transition) edge.getElement()).getInstruction();

		int color = style.getLineColor();
		if (transitionElement instanceof Store)
		{
			color = WRITE.hashCode();
		} else if (transitionElement instanceof Load)
		{
			color = READ.hashCode();
		} else if (transitionElement instanceof CmpXchg)
		{
			color = CAS.hashCode();
		} else if (transitionElement instanceof Alloc)
		{
			color = ALLOCA.hashCode();
		} else if (transitionElement instanceof Fence)
		{
			color = FENCE.hashCode();
		}
		
		if(edge.getElement() instanceof FlushTransition)
		{
			color = FLUSH.hashCode();
		}

		if (color != style.getLineColor())
		{
			style.setLineWidth(2);
			style.setLineColor(color);
		}

		return edge;
	}
	
	public Node createControlFlowLocation_2001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = super.createControlFlowLocation_2001(domainElement, containerView, index, persisted, preferencesHint);

		ControlFlowLocation loc = ((ControlFlowLocation)node.getElement());
		//end node or start node
		if(loc.getOutgoing().isEmpty() || (loc.getBuffer() != null && loc.getBuffer().getAddressValuePairs().isEmpty() && loc.getPc() == 0)){
			org.eclipse.swt.graphics.RGB fillRGB = END_NODE;
			ViewUtil.setStructuralFeatureValue(node,
					NotationPackage.eINSTANCE.getFillStyle_FillColor(),
					FigureUtilities.RGBToInteger(fillRGB));
		}

		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineWidth(), -1);
		return node;
		
	}
	

}
