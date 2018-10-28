package concepts.implementation.designpatterns.decoratorpattern.decorators;

import concepts.implementation.designpatterns.decoratorpattern.Shape;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LineThicknessDecorator extends ShapeDecorator{

	private double thickness = 1;
	private Shape decoratedShape;
	
	public LineThicknessDecorator(Shape decoratedShape) {
		super(decoratedShape);
		this.decoratedShape = decoratedShape;
	}
	
	public LineThicknessDecorator(Shape decoratedShape, double thickness) {
		super(decoratedShape);
		this.decoratedShape = decoratedShape;
		this.thickness = thickness;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.print("\tLine Thickness:" + thickness);
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