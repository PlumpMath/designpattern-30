package designPattern.proxy.virtual;

import java.lang.reflect.Constructor;

public class LargeClassProxy implements ILargeClass {
	
	private ILargeClass largeClass;
	
	private String title;

	public LargeClassProxy(String title) {
		this.title = title;
	}

	public void method1() {
		if (largeClass == null)
			largeClass = createLargeClass();
		largeClass.method1();
	}

	public void method2() {
		if (largeClass == null)
			largeClass = createLargeClass();
		largeClass.method2();
	}

	private ILargeClass createLargeClass() {
		
		ILargeClass lc = null;
		try {

			Class c = Class.forName("designPattern.proxy.virtual.LargeClass");
			System.out.println("Creating instance of LargeClass");
			Class[] args = new Class[] { String.class };

			Constructor cons = c.getConstructor(args);

			Object[] actualArgs = new Object[] { title };
			lc = (ILargeClass) cons.newInstance(actualArgs);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		return lc;
	}
}
