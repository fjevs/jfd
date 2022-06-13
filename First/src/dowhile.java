import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		File evidence = new File("cookedBooks.txt");
		try {
			out.println("Looking for " + evidence.getCanonicalPath());
			} catch (java.io.IOException e) {
			e.printStackTrace();
			}
		Scanner keyboard = new Scanner(System.in);
		char reply;
		
		do {
			out.print("Delete evidence? (y/n) ");
			reply = keyboard.findWithinHorizon(".",0).charAt(0);
		} while (reply != 'y' && reply != 'Y' && reply != 'n' && reply!='N');
		
		if (reply == 'y' || reply == 'Y') {
			out.println("Okay, here goes...");
			evidence.delete();
			out.println("The evidence has been deleted.");
		} else {
			out.println("Sorry, buddy. Just asking.");
		}
		keyboard.close();

	}

}
