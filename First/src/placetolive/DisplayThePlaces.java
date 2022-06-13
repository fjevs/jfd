package placetolive;
import java.util.Scanner;

public class DisplayThePlaces {
	public static void main(String args[]) {
		PlaceToLive hue = new PlaceToLive();
		hue.setAddress("Beech");
		hue.setNumofbedrooms(2);
		hue.setArea(20);
		
		Scanner keyboard = new Scanner(System.in);
		double cost = keyboard.nextDouble();
		
		System.out.println("Cost per square foot is " + cost/hue.getArea());
		System.out.println("Cost per bedroom is " + cost/hue.getNumofbedrooms());
		keyboard.close();
		
		DummiesFrame frame = new DummiesFrame("Calculating deez nuts");
		frame.addRow("Area");
		frame.addRow("Num of bedrooms");
		frame.addRow("Cost");
		frame.setButtonText("Check");
		frame.go();
	}
	
	public static String calculate(double firstNumber, int secondNumber, double thirdNumber) {
		return "Cost per square foot is " + thirdNumber/firstNumber + "cost per bedroom is " + thirdNumber/secondNumber;
	}
	
	
}
