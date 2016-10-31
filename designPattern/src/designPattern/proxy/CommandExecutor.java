package designPattern.proxy;

public class CommandExecutor implements ICommandExecutor{

	@Override
	public void runCommand(String cmd) throws Exception {
		 Runtime.getRuntime().exec(cmd);         
		 System.out.println("'" + cmd + "' command executed."); 
		
	}

}
