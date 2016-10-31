package designPattern.abstractfactory;

public class WindowsWidgetFactory implements WidgetFactory {

	@Override
	public AbstractFrameWidget createFrame() { 
		// TODO Auto-generated method stub
		return new WindowsFrame();
	}

	@Override
	public AbstractButtonWidget createButton() {
		return new WindowsButton();
	}

	@Override
	public AbstractCheckboxWidget createCheckbox() {
		return new WindowsCheckbox();
	}

	@Override
	public AbstractListboxWidget createListbox() {
		return new WindowsListbox();
	}

}
