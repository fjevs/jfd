

public class guesG {

	public static void main(String[] args) {
		DummiesFrame frame = new DummiesFrame("Greet Me!");
		frame.addRow("Your first name");
		frame.go();
		
		

	}
	
	public static String calculate(String firstName) {
		return "Hello, " + firstName + "!";
		}

}
