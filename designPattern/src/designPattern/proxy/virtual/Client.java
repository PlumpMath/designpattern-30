package designPattern.proxy.virtual;

public class Client {
	public static void main(String args[]) {
		// Create a LargeClass proxy.
		ILargeClass lc = new LargeClassProxy("Title");
		// Do other things...
		System.out.println("Doing other things...");
		// Now invoke a method of LargeClass.
		// The proxy will create it.
		lc.method1();
	}
}