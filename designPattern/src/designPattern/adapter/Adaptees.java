package designPattern.adapter;

public interface Adaptees {
	
	public void add(String str);

	public void remove(int pos);

	public String get(int pos);

	public boolean empty();

	public int getEnd();

}
