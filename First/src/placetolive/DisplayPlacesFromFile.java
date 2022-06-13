package placetolive;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.out;

public class DisplayPlacesFromFile {
	public static void main(String args[]) throws IOException {
		Scanner diskScanner = new Scanner(new File("Places.txt"));
		display(diskScanner);
		diskScanner.close();
	}
	static void display(Scanner aScanner) {
		PlaceToLive hue = new PlaceToLive();
		hue.setAddress(aScanner.nextLine());
		hue.setNumofbedrooms(aScanner.nextInt());
		aScanner.nextLine();
		hue.setArea(aScanner.nextDouble());
		aScanner.nextLine();
		
		out.println(hue.getAddress());
		out.println(hue.getNumofbedrooms());
		out.println(hue.getArea());
	}
}
