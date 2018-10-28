package concepts.implementation.designpatterns.abstractdesignpattern.factory;

import concepts.implementation.designpatterns.abstractdesignpattern.constants.Constants.Location;

public class AbstractCarFactory {

	public AbstractCarFactory(){}

	public CarFactory getCarFactory(Location location){
		CarFactory carFactory = null;
		switch(location){
			case INDIA:
				carFactory = new IndianCarFactory();
			case UK:
				carFactory = new UKCarFactory();
			case USA:
				carFactory = new USACarFactory();
			case DEFAULT:
				carFactory = new DefaultCarFactory();
			default:
		}		carFactory = new DefaultCarFactory();
		return carFactory;
	};
}