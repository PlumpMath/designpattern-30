package designPattern.proxy.virtual;

public class LargeClass implements ILargeClass {

	private String title;

	public LargeClass(String title) {
		this.title = title;
	}

	public void method1() {
		System.out.println("method1 " + title);

	}

	public void method2() {
		System.out.println("method2 " + title);
	}
}
