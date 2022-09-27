
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger aLogger = new AsteriskLogger();
		
		Logger sLogger = new SpacedLogger();
		
		
		aLogger.log("Testing the Asterisk Logger Log method");
		aLogger.error("Testing the Asterisk Logger error method");
		
		sLogger.log("Testing the Spaced Logger Log method");
		sLogger.error("Testing the Spaced Logger Error method");
	}

}
