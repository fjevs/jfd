import static java.lang.System.*;
import java.util.Scanner;
import java.util.Random;

public class makechange {
	public static void main(String args[]) {
		out.print("Passwordio?");
		
		Scanner keyboard = new Scanner (in);
		String password = keyboard.next();
		
		
		out.println("Yoy typed >>" + password + "<<");
		out.println(password);
		
		if (password == "swordfish") {
			out.println("stored yeah hueah");
		} else {
			out.println("Is not stored hueah");
		}
		out.println("GTFO");
		
		if (password.equals("swordfish"))
			out.println("same chars bruh");
		else
			out.println("not same chars bruh");
		
		keyboard.close();
		
	}

}