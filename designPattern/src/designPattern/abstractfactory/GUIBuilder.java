package designPattern.abstractfactory;

public class GUIBuilder {
	
	private WidgetFactory widgetFactory;

	public GUIBuilder() {
		if (System.getProperty("os.name").startsWith("Windows")) {
			widgetFactory = new WindowsWidgetFactory();
		} else if (System.getProperty("os.name").startsWith("Mac")) {
			widgetFactory = new MacWidgetFactory();
		}
	}

	public WidgetFactory getWidgetFactory() {
		return widgetFactory;
	}

	public static void main(String[] args) {
		GUIBuilder guiBuilder = new GUIBuilder();
		WidgetFactory wf = guiBuilder.getWidgetFactory();
		if (wf == null) {
			System.out.println("This platform is not being supported.");
			return;
		}
		AbstractFrameWidget myFrame = wf.createFrame();
		AbstractButtonWidget myButton = wf.createButton();
		AbstractCheckboxWidget myCheckbox = wf.createCheckbox();
		AbstractListboxWidget myListbox = wf.createListbox();
		
		System.out.println(myFrame.getClass().getName());
		System.out.println(myButton.getClass().getName());
		System.out.println(myCheckbox.getClass().getName());
		System.out.println(myListbox.getClass().getName());
	}
}
