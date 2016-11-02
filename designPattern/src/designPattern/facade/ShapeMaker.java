package designPattern.facade;

public class ShapeMaker {
	private Shape triangle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		triangle = new Triangle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawTriangle() {
		triangle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}