package designPattern.builder;

public class Meal {

	private String name;
	private Drink drink;
	private MainDish mainDish;
	private SideDish sideDish;
	
	public Meal(String string) {
		this.name=string;
	}
	public void setDrink(Drink drink2) {
		this.drink=drink2;
		
	}
	public void setMainDish(MainDish main) {
		this.mainDish=main;
		
	}
	public void setSideDish(SideDish side) {
		this.sideDish=side;
		
	}
	public String getName() {
		return name;
	}
	public Drink getDrink() {
		return drink;
	}
	public MainDish getMainDish() {
		return mainDish;
	}
	public SideDish getSideDish() {
		return sideDish;
	}

}
