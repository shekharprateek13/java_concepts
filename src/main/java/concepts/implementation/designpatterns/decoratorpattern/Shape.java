/**
 * 
 */
package concepts.implementation.designpatterns.decoratorpattern;

/**
 * @author shekh
 *
 */
public interface Shape {
	void draw();
	void resize();
	String description();
	boolean isHide();
}