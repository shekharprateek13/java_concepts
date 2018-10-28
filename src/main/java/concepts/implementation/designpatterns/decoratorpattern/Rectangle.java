/**
 * 
 */
package concepts.implementation.designpatterns.decoratorpattern;

/**
 * @author shekh
 *
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("\nDrawing Rectangle!");
	}

	@Override
	public void resize() {
		System.out.println("Drawing Rectangle!");		
	}

	@Override
	public String description() {
		return "Rectangle Shape";
	}

	@Override
	public boolean isHide() {
		return false;
	}

}
