package designPattern.visitor;

public interface OrderItem {
	public void accept(Visitor visitor); 
}
