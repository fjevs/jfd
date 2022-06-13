import static java.lang.System.out;

public class fockingstars {

	public static void main(String[] args) {
		for (int a = 0; a < 3; a++) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j <= i; j++) {
					out.print("*");
				}
				out.println();
			}

		}
	}
}
