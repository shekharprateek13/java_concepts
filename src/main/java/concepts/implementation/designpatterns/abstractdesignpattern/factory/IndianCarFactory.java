package concepts.implementation.designpatterns.abstractdesignpattern.factory;

import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.CarType;
import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.Location;
import concepts.implementation.designpatterns.abstractdesignpattern.entity.Car;

public class IndianCarFactory implements CarFactory {

	@Override
	public Car buildCar(CarType type, Location location) {
		return new Car(type,location);
	}
}