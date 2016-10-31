package designPattern.adapter;

public class Client {
	
	public static void main(String[] args) {
		
		Adapter adapter=new Adapter();
		adapter.setAdaptee(new Adaptee());
		adapter.push("Bimal1");
		adapter.push("Bimal2");
		adapter.push("Bimal3");
		adapter.push("Bimal4");
		System.out.println(adapter.pop());
		System.out.println(adapter.pop());
		System.out.println(adapter.pop());
		System.out.println(adapter.pop());
		System.out.println(adapter.isEmpty());
	
		
	}

}
