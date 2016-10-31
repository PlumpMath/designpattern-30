package designPattern.composite;

public class Composite extends Component {
	
	public Composite(String title) {
		//this.title=title;
		super(title);
	}

	public void print() {
		System.out.println("Composite name=" + title);
		for (Component item : list) {
			item.print();
		}
	}
}
