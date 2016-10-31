package designPattern.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		AbstractAgent junior = new JuniorAgent();
		AbstractAgent senior = new SeniorAgent();
		AbstractAgent supervisor = new AgentSupervisor();
		junior.nextAgent = senior;
		senior.nextAgent = supervisor;
		Request request = new Request();
		junior.handleRequest(request);
	}

}