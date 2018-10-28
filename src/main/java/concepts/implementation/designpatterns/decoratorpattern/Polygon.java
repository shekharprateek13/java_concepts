/**
 * 
 */
package concepts.implementation.designpatterns.decoratorpattern;

/**
 * @author shekh
 *
 */
public class Polygon implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Polygon!");
	}

	@Override
	public void resize() {
		System.out.println("Drawing Polygon!");		
	}

	@Override
	public String description() {
		return "Polygon Shape";
	}

	@Override
	public boolean isHide() {
		return false;
	}

}
