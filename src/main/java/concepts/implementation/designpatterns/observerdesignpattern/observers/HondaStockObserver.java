package concepts.implementation.designpatterns.observerdesignpattern.observers;

import concepts.implementation.designpatterns.observerdesignpattern.constants.StockType;

public class HondaStockObserver extends StockObserver{

	public HondaStockObserver(StockType stockType) {
		super(stockType);
	}

	@Override
	public void updateStockPrice(StockType stockType, double priceChange) {
		if(this.getStockType() == stockType){
			double oldPrice = this.stockValue;
			this.stockValue += priceChange; 
			System.out.println("Updated Stock price for "+ getStockType());
			System.out.println("Old Price: "+ oldPrice + "; New Price: "+ this.stockValue);
		}
	}
}