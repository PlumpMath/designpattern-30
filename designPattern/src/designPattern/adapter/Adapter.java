package designPattern.adapter;

public class Adapter implements Stackz{
	
	Adaptees adaptee;
	
	public void setAdaptee(Adaptees adaptee){
		this.adaptee=adaptee;
	}

	@Override
	public void push(String str) {
		adaptee.add(str);
		
	}

	@Override
	public String pop() {
		int end=adaptee.getEnd();
		String s=adaptee.get(end);
		adaptee.remove(end);
		return s;
	}

	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}
	

}
