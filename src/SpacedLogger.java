
public class SpacedLogger implements Logger {

	@Override
	public void log(String info) {
		// TODO Auto-generated method stub
		String stringOut = "";
		
		
		for (int i = 0; i < info.length(); i++) {
			stringOut += info.charAt(i) + " ";
		}
		
		System.out.println(stringOut);
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String stringOut = "";
		
		
		for (int i = 0; i < error.length(); i++) {
			stringOut += error.charAt(i) + " ";
		}
		
		System.out.println("ERROR: " + stringOut);
	
	}

}
