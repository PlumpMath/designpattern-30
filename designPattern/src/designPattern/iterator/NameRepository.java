package designPattern.iterator;

public class NameRepository implements Aggregate {
	
	private String names[] = { "Rob", "Jon", "Jul", "Lor", "Pat", "Ken" };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
