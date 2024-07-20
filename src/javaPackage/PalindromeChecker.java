package javaPackage;
import java.util.Scanner;

public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);
		 
		 String entStr, origStr, revStr = "";
		 int strLength;
		 
		 System.out.print("---Palindrome Checker---\n\n");
			 
		 System.out.print("Enter word/phrase: ");
		 entStr = input.nextLine();
		 origStr = entStr.replaceAll("[^a-zA-Z0-9]","");
		
		 strLength = origStr.length() - 1;
		 do
		 {
			 revStr = revStr + origStr.charAt(strLength);
			 strLength--; 
		 }while(strLength >= 0);
		 
		 System.out.println("The reversed word/phrase is '" + revStr + "'.");
		 
		 if(origStr.equalsIgnoreCase(revStr))
		 {
			 System.out.print("Therefore, '" + entStr + "' is a PALINDROME.");
		 } 
		 else
		 {
			 System.out.print("Therefore, '" + entStr + "' is NOT a PALINDROME.");
		 }
	}

}
