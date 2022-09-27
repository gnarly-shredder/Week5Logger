
public class AsteriskLogger implements Logger{

	@Override
	public void log(String info) {
		// TODO Auto-generated method stub
		System.out.println("***" + info + "***");
	}

	@Override
	public void error(String error) {
		
		String numAsterisk = "";
		
		for (int i = 0; i < error.length(); i++) {
			numAsterisk += "*";
			
		}
		System.out.println("\n" +numAsterisk + "*************" + "\n" + "\n" + "***Error: " + error + "***" + "\n" + "\n" + "*************" + numAsterisk + "\n");

}


}