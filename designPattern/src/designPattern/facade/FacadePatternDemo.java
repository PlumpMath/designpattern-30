package designPattern.facade;

public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawTriangle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}