package designPattern.momento;

public class Originator {
	private String externalizedState;

	public String getExternalizedState() {
		return externalizedState;
	}

	public void setExternalizedState(String externalizedState) {
		this.externalizedState = externalizedState;
	}

	public Memento saveStateToMemento() {
		return new Memento(externalizedState);
	}

	public void getStateFromMemento(Memento Memento) {
		externalizedState = Memento.getState();
	}
}
