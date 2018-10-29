package concepts.implementation.designpatterns.observerdesignpattern.observers;

import concepts.implementation.designpatterns.observerdesignpattern.constants.StockType;

public class HondaStock extends Stock{

	HondaStock(StockType stockType) {
		super(stockType);
	}

	@Override
	public void updateStockPrice(StockType stockType, int priceChange) {
		if(this.getStockType() == stockType){
			this.stockValue += priceChange; 
			System.out.println("Updated Stock price for "+ getStockType());
		}
	}
}