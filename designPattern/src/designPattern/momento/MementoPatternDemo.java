package designPattern.momento;

public class MementoPatternDemo {
	
	   public static void main(String[] args) {
	   
	      Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      
	      originator.setExternalizedState("State #1");
	      originator.setExternalizedState("State #2");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setExternalizedState("State #3");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setExternalizedState("State #4");
	      System.out.println("Current State: " + originator.getExternalizedState());		
	      
	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getExternalizedState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getExternalizedState());
	   }
	}
