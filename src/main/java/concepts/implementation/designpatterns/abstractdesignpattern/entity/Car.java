package concepts.implementation.designpatterns.abstractdesignpattern.entity;

import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.CarType;
import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.Location;
import lombok.Getter;

@Getter
public class Car {
	
	private CarType carType;
	private final Location location;
	
	public Car(CarType carType, Location location){
		this.carType = carType;
		this.location = location;
	}
	
	
}