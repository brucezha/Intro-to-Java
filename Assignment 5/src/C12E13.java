/*
(Count characters, words, and lines in a file) This program will count 
the number of characters, words, and lines in a file. Words are separated by   
whitespace characters. The file name should be passed as a command-line        
argument, as shown in Figure 12.13.                                            
*/

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class C12E13 {
	public static void main(String[] args) {
		int repeatInt = 1;
		System.out.println("This program will the number of characters, words, and lines in a file.");
		
		while(repeatInt == 1) {
			try {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents (*.txt)", "txt");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(null);
				String filename = chooser.getSelectedFile().getName();
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					System.out.println("You have successfully chosen the file " + filename);
				}
			    
				File file = chooser.getSelectedFile();
				Scanner fileInput = new Scanner(file);
				
				int chars = 0;
				int words = 0;
				int lines = 0;
				int spaces = 0;
				
				while (fileInput.hasNext()) {
					String s = fileInput.nextLine();    
					words = countWordFunc(s) + words;
					chars = s.length() + chars;        
					spaces = countSpaceFunc(s) + spaces;  
					lines++;                              
				}
				
				int countChar2 = chars - spaces;
				
				System.out.println("Words: " + words);
				System.out.println("Characters: " + countChar2);
				System.out.println("Lines: " + lines);
				
				fileInput.close();
			}
			catch (Exception e) {
				System.out.println("Exception: Open ERROR.");
			}
			
			Scanner intInput = new Scanner(System.in);
			System.out.print("Do you want to check for another file? (1 for yes or 0 for no) ");
			repeatInt = intInput.nextInt();
			intInput.close();
		}
		System.out.println("Have a great day!");
	}
	
	public static int countWordFunc(String s) {
		int wordCount = 0;
		Scanner wordInput = new Scanner(s);
		
		while (wordInput.hasNext()) {
			String word = wordInput.next();
			wordCount++;
		}
		wordInput.close();
		return wordCount;
	}
	
	public static int countSpaceFunc(String s) {
		int spaceCount = 0;
		for(int i = 0;i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ') {
				spaceCount++;
			}		
		}
		return spaceCount;
	}
}