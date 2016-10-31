package designPattern.chainofresponsibility;

public abstract class AbstractAgent {
	
	protected AbstractAgent nextAgent;

	abstract public void handleRequest(Request req);

	boolean canHandleRequest(Request req) {
		return true;
	}
}