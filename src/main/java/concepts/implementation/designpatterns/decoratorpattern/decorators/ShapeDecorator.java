package concepts.implementation.designpatterns.decoratorpattern.decorators;

import concepts.implementation.designpatterns.decoratorpattern.Shape;

public abstract class ShapeDecorator implements Shape{
	
	protected Shape decoratedShape;
	
	ShapeDecorator(Shape shape){
		super();
		this.decoratedShape = shape;
	}
}