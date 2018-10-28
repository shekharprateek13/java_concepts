package concepts.implementation.designpatterns.abstractdesignpattern.manager;

import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.CarType;
import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.Location;
import concepts.implementation.designpatterns.abstractdesignpattern.entity.Car;
import concepts.implementation.designpatterns.abstractdesignpattern.factory.AbstractCarFactory;
import concepts.implementation.designpatterns.abstractdesignpattern.factory.CarFactory;

public class Manager {
	
	public interface CarService{
		public void printCarDetails(Car car);
	}
	
	
	public static void main(String...args){
		AbstractCarFactory abstractFactory = new AbstractCarFactory();
		
		CarFactory indianCarFactory = abstractFactory.getCarFactory(Location.INDIA);
		CarFactory usaCarFactory = abstractFactory.getCarFactory(Location.INDIA);
		CarFactory ukCarFactory = abstractFactory.getCarFactory(Location.INDIA);
		CarFactory defaultCarFactory = abstractFactory.getCarFactory(Location.INDIA);
		
		Car indianCar = indianCarFactory.buildCar(CarType.HATCHBACK,Location.INDIA);
		Car defaultCar = defaultCarFactory.buildCar(CarType.LUXURY, Location.DEFAULT);
		Car usaCar = usaCarFactory.buildCar(CarType.LUXURY,Location.USA);
		Car ukCar = ukCarFactory.buildCar(CarType.HATCHBACK,Location.UK);
		
		CarService carService = (car) -> {System.out.println("Car Type: "+ car.getCarType()+ ";  Location: "+car.getLocation());};
		
		carService.printCarDetails(indianCar);
		carService.printCarDetails(usaCar);
		carService.printCarDetails(ukCar);
		carService.printCarDetails(defaultCar);
		
	}
}