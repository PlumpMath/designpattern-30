package designPattern.facade;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
		System.out.println(" _______________ ");
		System.out.println("|           	|");
		System.out.println("|           	|");
		System.out.println("|           	|");
		System.out.println("|           	|");
		System.out.println("|_______________|");
		System.out.println("");
	}
}