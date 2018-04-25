
/*
(Occurrences of a specified character) This program will find the number of
occurrences of a specified character in a string using the following header:
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string followed by a character and displays the number
of occurrences of the character in the string.
*/
import java.util.Scanner;

public class C6E23 {
	static boolean cont = true;
	static boolean same = true;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the number of occurrences of a specified character in a string");
		out: while (cont) {
			System.out.print("Please enter the string you want to check (only letters are allowed) ");
			 	String word = input.next();
			try {
				if(isStringValid(word));
				while (same) {
					System.out.print("Please enter the charactor you want to check for occurrences ");
					 char charactor = input.next().charAt(0);

					System.out.println("The number of occurrence of " + charactor + " in \"" + word + "\" is: "
							+ count(word, charactor));
					System.out.print("Do you want to check the occurences of a differnt charactor? (Enter yes or no) ");
					String userInput = input.next();
					if (userInput.equals("Yes") || userInput.equals("yes")) {
						same = true;
					} else if (userInput.equals("No") || userInput.equals("no")) {
						System.out.print("Do you want to check a different string? (Enter yes or no) ");
						String theInput = input.next();
						if (theInput.equals("yes") || theInput.equals("yes")) {
							break;
						} else if (theInput.equals("no") || theInput.equals("no")) {
							input.close();
							System.out.print("Have a great day!");
							break out;
						}

					}
				}
			}

			catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a)
				count++;
		}
		return count;
	}

	private static String errorMessage = "";

	public static boolean isStringValid(String str) throws Exception {
		char[] strArr = str.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			if (!isValid(strArr[i])) {
				errorMessage = "Invalid String:" + " The String contains only letters.";
				Exception e = new Exception(errorMessage);
				throw e;
			}
		}
		return true;
	}

	private static boolean isValid(char a) throws Exception {
		if (!Character.isLetter(a))
			return false;
		return true;
	}
}
