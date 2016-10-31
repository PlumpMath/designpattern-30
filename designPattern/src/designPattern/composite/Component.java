package designPattern.composite;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component {
	
	protected Collection<Component> list = new ArrayList<Component>();
	
	protected String title;

	public Component(String title2) {
		title=title2;
	}

	public abstract void print();

	public void addItem(Component item) {
		list.add(item);
	}
}
