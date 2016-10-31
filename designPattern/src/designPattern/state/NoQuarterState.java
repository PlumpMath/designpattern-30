package designPattern.state;

public class NoQuarterState implements State {
	
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {

		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Quarter Inserted");
		gumballMachine.setState(gumballMachine.gethasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("Quarter not Inserted");
		//gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("You turned...please insert quarter");
		//gumballMachine.setState(gumballMachine.getSoldState());
	}

	public void dispense() {         
		System.out.println("No gumball dispensed");     
	}
}
