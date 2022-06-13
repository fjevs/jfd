import javax.swing.JOptionPane;

public class upcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = JOptionPane.showInputDialog("Username:");
		
		
		if 	(username != null) {
			String password = JOptionPane.showInputDialog("Password:");
			if (password != null) {
				if (
						(username.equals("bburd") && password.equals("swordfish")) ||
						(username.equals("hritter") && password.equals("preakston"))
					) {
					JOptionPane.showMessageDialog(null, "You're in.");
				}
				
			} else JOptionPane.showMessageDialog(null, "Not enough info");
		} else JOptionPane.showMessageDialog(null, "Not enough info");
				
/*				(
						(username.equals("bburd") && password.equals("swordfish")) ||
						(username.equals("hritter") && password.equals("preakston"))
				)
				)
				{
					JOptionPane.showMessageDialog(null, "You're in.");
				} else {
					JOptionPane.showMessageDialog(null, "You're sus");*/
				

	}

}
