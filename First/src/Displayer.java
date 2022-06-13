import javax.swing.JFrame;

public class Displayer {

	public static void main(String args[]) {
		JFrame myFrame = new JFrame();
		String myTitle = "blanmlk";
		
		
		myFrame.setSize(300, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setTitle(myTitle);
	}
	
}
