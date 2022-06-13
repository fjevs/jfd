import static java.lang.System.out;
import java.util.Scanner;

public class auth {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Username: ");
		String username = keyboard.next();
		
		
		if (username.equals("bburd")) {
			out.print("Password: ");
			String password = keyboard.next();
				
				if (password.equals("swordfish")) {
					out.println("You're in");
				} else {
					out.println("Inc password");
				}
			} else {
				out.println("Unkn user");
		}
		keyboard.close();
	}

}
