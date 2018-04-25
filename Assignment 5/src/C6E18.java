/*
6.18 
(Check password) Some websites impose certain rules for passwords. This program
* checks whether a string is a valid password. Suppose the password rules are as follows:
* A password must have at least eight characters.
* A password consists of only letters and digits.
* A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.
 */
import javax.swing.JOptionPane;

public class C6E18 {
	public static void main(String[]args) {		
		int option=JOptionPane.YES_OPTION;
		
		while (option == JOptionPane.YES_OPTION) {
			try {
				String password=JOptionPane.showInputDialog("This program checks whether a string is a valid password. \nEnter a password that has at least 8 letters and 2 must be digits");
				isValid(password);
				
				option = JOptionPane.showConfirmDialog(null, "Valid Password"+"\nDo you want to check another one?");
			}
			catch(IllegalArgumentException ex) {
				String outputStr = "Invalid passowrd: "+ ex.getMessage()+ "\nDo you want to check another one?";
				option = JOptionPane.showConfirmDialog(null, outputStr);
			}
		}
}


public static boolean isValid(String password) {

		if (password.length() < 8) {
			throw new IllegalArgumentException("Your password must have at least eight characters");
		}
		String reg1 = "^[A-Za-z0-9]+$";
		if (!password.matches(reg1)) {
			throw new IllegalArgumentException("Your password only can include letters and digits");
		}
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
				count++;
			}
		}
		if (count < 2) {
			throw new IllegalArgumentException("Your password must contain at least two digits");		
			}
		return true;
	}
	}