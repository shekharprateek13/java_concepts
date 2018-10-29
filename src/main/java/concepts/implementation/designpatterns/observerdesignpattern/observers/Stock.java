/**
 * 
 */
package concepts.implementation.designpatterns.observerdesignpattern.observers;

import concepts.implementation.designpatterns.observerdesignpattern.constants.StockType;

public abstract class Stock {
	int stockValue;
	final StockType stockType;
	
	Stock(StockType stockType){
		this.stockType = stockType;
	}
	
	public abstract void updateStockPrice(StockType stockType,int priceChange);
	
	public int getStockValue(){
		return this.stockValue;
	}
	
	public StockType getStockType(){
		return this.stockType;
	}
}