import static java.lang.System.out;
import java.util.Scanner;

public class factorio {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int hue = 1;
		out.println("Enter number you fuckface");
		
		
		for (int numb = keyb.nextInt(); numb != 0; numb--) {
			hue *= numb;
		}
		out.println(hue);
		keyb.close();
	}

}
