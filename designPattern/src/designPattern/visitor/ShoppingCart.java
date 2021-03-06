package designPattern.visitor;

import java.util.List;

public class ShoppingCart { 
	// normal shopping cart stuff
	private List<OrderItem> items;

	public double calculateShippingFee() {
		// create a visitor
		ShippingFeeVisitor visitor = new ShippingFeeVisitor();
		// iterate through all items
		for (OrderItem item : items) {
			item.accept(visitor);
		}
		double postage = visitor.getTotalShippingFee();
		return postage;
	}
}
