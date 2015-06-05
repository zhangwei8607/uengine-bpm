package org.uengine.kernel.bpmn.view;

import org.uengine.kernel.bpmn.ParallelGateway;
import org.uengine.kernel.view.ActivityView;
import org.uengine.modeling.IElement;
import org.uengine.modeling.Symbol;

public class ParallelGatewayView extends ActivityView {

public final static String SHAPE_ID = "OG.shape.bpmn.G_Parallel";
	
	public ParallelGatewayView(){
		setShapeId(SHAPE_ID);
	}
	
	public ParallelGatewayView(IElement element){
		super(element);
	}
	
	@Override
	public Symbol createSymbol() {
		Symbol symbol = new Symbol();
		symbol.setName("병렬");
		symbol.setShapeId(SHAPE_ID);
		symbol.setHeight(40);
		symbol.setWidth(40);
		symbol.setElementClassName(ParallelGateway.class.getName());
		symbol.setShapeType("GEOM");
		
		return symbol;
	}
}