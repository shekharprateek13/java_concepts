package concepts.implementation.designpatterns.decoratorpattern.decorators;

import concepts.implementation.designpatterns.decoratorpattern.Shape;
import concepts.implementation.designpatterns.decoratorpattern.constants.LineStyle;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LineStyleDecorator extends ShapeDecorator{
	
	private LineStyle lineStyle;
	private Shape decoratedShape;
	
	public LineStyleDecorator(Shape decoratedShape){
		super(decoratedShape);
		this.decoratedShape = decoratedShape;
	}
	
	public LineStyleDecorator(Shape decoratedShape, LineStyle lineStyle){
		super(decoratedShape);
		this.decoratedShape = decoratedShape;
		this.lineStyle = lineStyle;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.print("\tLineStyle:"+lineStyle);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String description() {
		return decoratedShape.description();
	}

	@Override
	public boolean isHide() {
		return decoratedShape.isHide();
	}
}