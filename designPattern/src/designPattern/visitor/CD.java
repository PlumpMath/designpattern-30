package designPattern.visitor;

public class CD implements OrderItem {

	private double price;
	private double weight;

	// accept the visitor
	public void accept(Visitor visitor){ 
       visitor.visit(this);   
    }

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}