package organisations;

public class dummiesOrg {

	public static void main(String[] args) {
		DummiesFrame frame = new DummiesFrame("Guessing Game");
		frame.addRow("Name");
		frame.addRow("Revenue");
		frame.addRow("Status");
		frame.go();
	}
		public static double calculate(String name, int revenue, String status) {
			if (status.equals("profit")) {
				return revenue/10;
				}
			 else return revenue/2;
		}

	}
