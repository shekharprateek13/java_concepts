/**
 * 
 */
package concepts.implementation.designpatterns.decoratorpattern;

/**
 * @author shekh
 *
 */
public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Circle!");
	}

	@Override
	public void resize() {
		System.out.println("Drawing Circle!");		
	}

	@Override
	public String description() {
		return "Circle Shape";
	}

	@Override
	public boolean isHide() {
		return false;
	}

}
