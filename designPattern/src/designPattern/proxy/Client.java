package designPattern.proxy;

public class Client {
	
	public static void main(String[] args) {
		
		ICommandExecutor executor=new CommandExecutorProtectionProxy ("userme","password");
		try {
			executor.runCommand("ipconfig");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
