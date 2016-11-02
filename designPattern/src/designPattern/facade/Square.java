package designPattern.facade;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
		System.out.println(" ___________ ");
		System.out.println("|           |");
		System.out.println("|           |");
		System.out.println("|           |");
		System.out.println("|           |");
		System.out.println("|___________|");
		System.out.println("");
	}
}