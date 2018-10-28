package concepts.implementation.designpatterns.decoratorpattern.decorators;

import concepts.implementation.designpatterns.decoratorpattern.Shape;
import concepts.implementation.designpatterns.decoratorpattern.constants.Color;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ColorDecorator extends ShapeDecorator{
	private Color color;
	private Shape decoratedShape;
	
	public ColorDecorator(Shape decoratedShape){
		super(decoratedShape);
		this.decoratedShape = decoratedShape;
	}
	
	public ColorDecorator(Shape decoratedShape, Color color) {
		super(decoratedShape);
		this.decoratedShape = decoratedShape;
		this.color = color;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.print("\tColor: "+this.color);
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