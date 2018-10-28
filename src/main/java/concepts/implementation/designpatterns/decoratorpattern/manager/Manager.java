package concepts.implementation.designpatterns.decoratorpattern.manager;

import concepts.implementation.designpatterns.decoratorpattern.Circle;
import concepts.implementation.designpatterns.decoratorpattern.Rectangle;
import concepts.implementation.designpatterns.decoratorpattern.Shape;
import concepts.implementation.designpatterns.decoratorpattern.constants.Color;
import concepts.implementation.designpatterns.decoratorpattern.constants.LineStyle;
import concepts.implementation.designpatterns.decoratorpattern.decorators.ColorDecorator;
import concepts.implementation.designpatterns.decoratorpattern.decorators.LineStyleDecorator;
import concepts.implementation.designpatterns.decoratorpattern.decorators.LineThicknessDecorator;

public class Manager {
	
	public static void main(String[] args){
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		circle.draw();
		rectangle.draw();
		
		Shape newCircle = new ColorDecorator(new LineStyleDecorator(
				new LineThicknessDecorator(new Circle(),1.0),LineStyle.SOLID),Color.BLUE);
		
		Shape newRectangle = new LineStyleDecorator(new LineThicknessDecorator(new ColorDecorator(
				new Rectangle(),Color.RED),1.0),LineStyle.DASHES);
		
		newCircle.draw();
		newRectangle.draw();
	}
}