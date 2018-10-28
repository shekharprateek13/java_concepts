package concepts.implementation.designpatterns.abstractdesignpattern.factory;

import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.CarType;
import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.Location;
import concepts.implementation.designpatterns.abstractdesignpattern.entity.Car;

public interface CarFactory {
	
	public Car buildCar(CarType carType, Location location);

}