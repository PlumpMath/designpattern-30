package designPattern.facade;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Triangle::draw()");
		System.out.println("      .        ");
		System.out.println("     . . ");
		System.out.println("    .   . ");
		System.out.println("   .     . ");
		System.out.println("  .       . ");
		System.out.println(" ........... ");
		System.out.println("");
	}
}
