package designPattern.observer;

import java.util.ArrayList;
import java.util.List;


public class StockData implements Subject {
	private String symbol;
	private float close;
	private float high;
	private float low;
	private long volume;
	private List<Observer> observers;

	public StockData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0)
			observers.remove(i);
	}

	public void notifyObservers() {
		int n = observers.size();
		for (int i = 0; i < n; ++i) {
			Observer observer = (Observer) observers.get(i);
			observer.update(symbol, close, high, low, volume);
		}
	}

	public void sendStockData() {
		notifyObservers();
	}

	public void setStockData(String symbol, float close, float high, float low, long volume) {
		this.symbol = symbol;
		this.close = close;
		this.high = high;
		this.low = low;
		this.volume = volume;
		sendStockData();
	}

	
}