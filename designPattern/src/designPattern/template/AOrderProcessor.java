package designPattern.template;

public abstract class AOrderProcessor {

	public final void processOrder(IOrder order) {
		String orderDetails = getOrderDetails(order);
		float shippingFee = getShippingFee(order);
		int shippingTime = getShippingTime(order);
		sendConfirmation(orderDetails, shippingFee, shippingTime);
	}

	public abstract float getShippingFee(IOrder order);

	public abstract int getShippingTime(IOrder order);

	public abstract void sendConfirmation(String orderDetails, float shippingFee, int shippingTime);

	private String getOrderDetails(IOrder order) {
		String od = "";
		od += "Thank you for shopping with us!";
		od += "Here is the detailed information on your order:";
		return od;
	}

}
