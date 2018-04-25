
/*
(Occurrences of a specified character) This program will find the number of
occurrences of a specified character in a string using the following header:
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string followed by a character and displays the number
of occurrences of the character in the string.
*/
import java.util.Scanner;

public class C6E23 {
	public static void main(String args[]) throws Exception{
		Scanner input = new Scanner(System.in);
		String str = "";
		char key;
		int repeatOut=1;
		int repeatIn=1;
		System.out.println("This program will find the number of occurrences of a specified character in a string");
		while(repeatOut == 1) {
		    	System.out.print("Please enter the string you want to check (only letters are allowed) ");
		    	str = input.next();
		    	try {
		    	if(isStringValid(str))
		    	{
		    	while(repeatIn == 1) {
		    		System.out.print("Please enter the charactor you want to check for occurrences ");
		    		key = (char) input.next().charAt(0);
		    	  	
						System.out.println("The number of occurrence of "+ key +" in \"" + str +"\" is " +count(str,key));
		    		System.out.print(
			    			"Do you want to check the occurences of a differnt charactor? (1 for yes, 0 for no) ");
		    		 repeatIn = input.nextInt();
		    	  	}
		    	}
		    	} catch (Exception e) {
					System.out.println(e);
				}
		  
		    	System.out.print(
		    			"Do you want to check a different string? (1 for yes or 0 for no) ");
		        repeatOut = input.nextInt();
		        repeatIn = repeatOut;
		    }
		System.out.println("Have a good day!");
		input.close();
	}


	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a)
				count++;
		}
		return count;
	}

	public static boolean isStringValid(String str) throws Exception {
		char[] strArr = str.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			if (!isValid(strArr[i])) {
				String errorMessage = "Invalid String:" + " Only Strings are allowed.";
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
