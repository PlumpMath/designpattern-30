package designPattern.state;

public class GumballMachine {
	
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State currentState; // current state 
	private int count = 0; //number of Gumballs available 
	
	public GumballMachine(int numberGumballs) { 
		 soldOutState = new SoldOutState(this); 
		 noQuarterState = new NoQuarterState(this); 
		 hasQuarterState = new HasQuarterState(this); 
		 soldState = new SoldState(this);

		this.count=numberGumballs;
		
		if(numberGumballs>0){
			currentState = noQuarterState;
		}
	
	}
	
	public  State getNoQuarterState(){
		return this.noQuarterState;
	}
	
	public  State getSoldState(){
		return this.soldState;
	}
	
	public  State getCurrentState(){
		return this.currentState;
	}
	
	public  State gethasQuarterState(){
		return this.hasQuarterState;
	}
	
	public  State getSoldOutState(){
		return this.soldOutState;
	}
	
	public void setState(State state){
		this.currentState=state;
	}
	
	public State getState(){
		return this.currentState;
	}
}
