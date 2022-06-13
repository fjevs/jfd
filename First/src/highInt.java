import static java.lang.System.out;
import java.util.Scanner;

public class highInt {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		int hue;
		
		out.println("Input numbers you dumbass");
		int inputN = keyb.nextInt();
		hue = inputN;
		while (inputN > 0) {
			if (inputN > hue) {
				hue = inputN;
				
			}
			inputN = keyb.nextInt();
		}
		out.println(hue);
		keyb.close();

	}

}
