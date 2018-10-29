package concepts.implementation.designpatterns.observerdesignpattern.manager;

import concepts.implementation.designpatterns.observerdesignpattern.constants.StockType;
import concepts.implementation.designpatterns.observerdesignpattern.observable.StockMarket;
import concepts.implementation.designpatterns.observerdesignpattern.observers.GeneralMotorsStockObserver;
import concepts.implementation.designpatterns.observerdesignpattern.observers.HondaStockObserver;
import concepts.implementation.designpatterns.observerdesignpattern.observers.ToyotaStockObserver;
import concepts.implementation.designpatterns.observerdesignpattern.observers.VolkswagonStockObserver;

public class Manager {
	public static void main(String[] args){
		StockMarket stockMarket = new StockMarket();
		
		for(StockType type: StockType.values()){
			switch(type){
			case TOYOTA:
				stockMarket.addObserver(new ToyotaStockObserver(StockType.TOYOTA));
				break;
			case VOLKSWAGON:
				stockMarket.addObserver(new VolkswagonStockObserver(StockType.VOLKSWAGON));
				break;
			case GENERAL_MOTORS:
				stockMarket.addObserver(new GeneralMotorsStockObserver(StockType.GENERAL_MOTORS));
				break;
			case HONDA:
				stockMarket.addObserver(new HondaStockObserver(StockType.HONDA));
				break;
			default:
				System.out.println("No Stock of this type is present!!!");
			}
		}
		
		stockMarket.notifyObserversForPriceChange(StockType.GENERAL_MOTORS,Math.random()*100);
		stockMarket.notifyObserversForPriceChange(StockType.GENERAL_MOTORS,Math.random()*100);
		stockMarket.notifyObserversForPriceChange(StockType.TOYOTA,Math.random()*100);
		stockMarket.notifyObserversForPriceChange(StockType.TOYOTA,Math.random()*100);
		stockMarket.notifyObserversForPriceChange(StockType.HONDA,Math.random()*100);
		stockMarket.notifyObserversForPriceChange(StockType.HONDA,Math.random()*100);
		stockMarket.notifyObserversForPriceChange(StockType.VOLKSWAGON,Math.random()*100);
		stockMarket.notifyObserversForPriceChange(StockType.VOLKSWAGON,Math.random()*100);
		stockMarket.notifyObserversForPriceChange(StockType.VOLKSWAGON,Math.random()*100);
	}
}