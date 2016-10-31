package designPattern.proxy.copyonwrite;


public class Ckient {
	
	public static void main(String[] args) {
		
		LargeHashTable largeHashTable=new LargeHashTable();
		Thread t1=new Thread(largeHashTable);
		Thread t2=new Thread(largeHashTable);
		Thread t3=new Thread(largeHashTable);
		t1.start();
		t2.start();
		t3.start();
	}

}
