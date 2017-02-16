package designPattern.decorator;

public class Window implements GUIContainer {

	@Override
	public void paint() { // implementation

	}

	@Override
	public String getDescription() {
		return "A Window Container";
	}
}
