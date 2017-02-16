package designPattern.visitor;

public class ShippingFeeVisitor implements Visitor {

	private double totalShippingFee;

	// collect data about the book
	@Override
	public void visit(Book book) {
		// assume we

		// have a calculation here related to weight and price // free postage
		// for a
		// book over 10
		if (book.getPrice() < 10.0) {
			totalShippingFee += book.getWeight() * 2;
		}
	}
	
	@Override
	public void visit(CD cd) {
		if (cd.getPrice() < 10.0) {
			totalShippingFee += cd.getWeight() * 2;
		}
	}
	@Override
	public void visit(DVD dvd) {
		if (dvd.getPrice() < 10.0) {
			totalShippingFee += dvd.getWeight() * 2;
		}
	}

	public double getTotalShippingFee() {
		return totalShippingFee;
	}

	
}