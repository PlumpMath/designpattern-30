package designPattern.proxy.copyonwrite;

import java.util.Hashtable;


public class LargeHashTable extends Hashtable<Object, Object> implements Runnable{

	private static final long serialVersionUID = 1L;
	private ReferenceCountedHashTable theHashTable;

	public LargeHashTable() {
		theHashTable = new ReferenceCountedHashTable();
	}

	public int size() {
		return theHashTable.size();
	}

	public synchronized Object get(Object key) {
		return theHashTable.get(key);
	}

	public synchronized Object put(Object key, Object value) {
		copyOnWrite();
		return theHashTable.put(key, value);
	}

	public synchronized Object clone() {
		Object copy = super.clone();
		theHashTable.addProxy();
		return copy;
	}

	private void copyOnWrite() {
		if (theHashTable.getProxyCount() > 1) {
			synchronized (theHashTable) {
				theHashTable.removeProxy();
				try {
					theHashTable = (ReferenceCountedHashTable) theHashTable.clone();
				} catch (Throwable e) {
					theHashTable.addProxy();
				}
			}
		}
	}

	private class ReferenceCountedHashTable extends Hashtable<Object, Object> {

		private static final long serialVersionUID = 1L;
		private int proxyCount = 1;

		public ReferenceCountedHashTable() {
			super();
		}

		public synchronized Object clone() {
			ReferenceCountedHashTable copy;
			copy = (ReferenceCountedHashTable) super.clone();
			copy.proxyCount = 1;
			return copy;
		}

		synchronized int getProxyCount() {
			return proxyCount;
		}

		synchronized void addProxy() {
			proxyCount++;
		}

		synchronized void removeProxy() {
			proxyCount--;
		}
	}

	@Override
	public void run() {
		
		LargeHashTable largeHashTable=new LargeHashTable();
		largeHashTable.put("key0", "value");
		System.out.println(largeHashTable.get("key0")+" key-0");
		largeHashTable.put("key1", "value");			
		largeHashTable.put("key2", "value");
		System.out.println(largeHashTable.get("key2")+" key-2");
		largeHashTable.put("key3", "value");
		largeHashTable.put("key4", "value");		
		largeHashTable.put("key5", "value");
		System.out.println(largeHashTable.get("key5")+" key-5");
		largeHashTable.put("key6", "value");
		largeHashTable.put("key7", "value");
		largeHashTable.put("key8", "value");
		
		
		
		
	}
}