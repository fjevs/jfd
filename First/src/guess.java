import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class guess {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int numG = 0;
		int randomN = new Random().nextInt(1) + 1;
		
		out.println(" ************ ");
		out.println("Welcome to the Guessing Game");
		out.println(" ************ ");
		out.println();
		
		out.print("ENter an int from 1 to 100: ");
		int inputNumber = keyboard.nextInt();
		numG++;
		
		while (inputNumber != randomN) {
			if (inputNumber > randomN) {
				out.println("Try low");
			} else {
				out.println("Try high, idiot");
			}
			out.println();
			out.println("Try again...");
			out.print("Enter an int from 1 to 10: ");
			inputNumber = keyboard.nextInt();
			numG++;
		}
		out.println("You win after ");
		out.println(numG + " guesses");
		keyboard.close();

	}

}
