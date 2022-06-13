import static java.lang.System.out;
import java.util.Scanner;

public class jswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		out.println("Which verse?");
		String verse = keyboard.next();
		
		switch (verse) {
		case "one":
			out.println("That's because he has no brain.");
			break;
		case "two":
			out.println("That's because he is a pain.");
			break;
		case "three":
			out.println("'Cause this is the last refrain.");
			break;
		default:
			out.println("No such verse. Please try again.");
			break;
		}
		
		out.println("Ohhhhhhhh ... .");
		
		keyboard.close();
	}

}
