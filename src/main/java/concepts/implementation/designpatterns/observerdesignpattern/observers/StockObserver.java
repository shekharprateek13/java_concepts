/**
 * 
 */
package concepts.implementation.designpatterns.observerdesignpattern.observers;

import concepts.implementation.designpatterns.observerdesignpattern.constants.StockType;

public abstract class StockObserver {
	double stockValue;
	final StockType stockType;
	
	StockObserver(StockType stockType){
		this.stockType = stockType;
	}
	
	public abstract void updateStockPrice(StockType stockType,double priceChange);
	
	public double getStockValue(){
		return this.stockValue;
	}
	
	public StockType getStockType(){
		return this.stockType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stockType == null) ? 0 : stockType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockObserver other = (StockObserver) obj;
		if (stockType != other.stockType)
			return false;
		return true;
	}
}