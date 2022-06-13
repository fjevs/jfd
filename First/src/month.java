import static java.lang.System.out;
import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		out.println("Which month?");
		
		String month = keyboard.next();
		


		switch (month) {
		case "Jan":
			out.println("31");
			break;
		case "Feb":
			out.println("Is it a leap or not?");
			String leap = keyboard.next();
			if (leap.equals("yes")) {
				out.println("29");
			} else {
				out.println("28");
			}
			break;
		case "Mar":
			out.println("31");
			break;
		case "Apr":
			out.println("30");
			break;
		case "May":
			out.println("31");
			break;
		default:
			out.println("No such month");
		}
		
		keyboard.close();
	}

}
