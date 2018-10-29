package concepts.implementation.designpatterns.observerdesignpattern.observable;

import java.util.ArrayList;
import java.util.List;

import concepts.implementation.designpatterns.observerdesignpattern.constants.StockType;
import concepts.implementation.designpatterns.observerdesignpattern.observers.StockObserver;

public class StockMarket {
	
	private List<StockObserver> stockObseverListing = new ArrayList<StockObserver>();
	
	public StockMarket(){}
	
	public boolean addObserver(StockObserver stockObserver){
		if(stockObseverListing.contains(stockObserver)){
			return false;
		}else{
			stockObseverListing.add(stockObserver);
		}
		return true;
	}
	
	public void notifyObserversForPriceChange(StockType stockType, double priceChange){
		for(StockObserver observer: stockObseverListing){
			observer.updateStockPrice(stockType, priceChange);
		}
	}
}