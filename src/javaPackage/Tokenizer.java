package javaPackage;

import java.util.Scanner;

public class Tokenizer 
{
	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);
		
		 System.out.print("---Tokenizer---\n\n");
		 
		 System.out.print("Enter source language: ");
		 String entSrcLang = input.nextLine();
		 
		 String srcLang = entSrcLang;  
		 String word[] = srcLang.split(" ");
		 
		 System.out.print("Output is: ");
		 
		 char token = 'a';
		 for(int i = 0; i < word.length; i++) 
		 {
			 switch(token)
			 {
			 	//Data Type
			 	case 'a': if(word[i].contains("String"))
			 			  {
			 				  System.out.print("<data_type>"); 
			 				  token = 'b';
			 			  }
			 			  else if(word[i].contains("char"))
			 			  {
			 				  System.out.print("<data_type>"); 
			 				  token = 'b';
			 			  }
			 			  else if(word[i].contains("int"))
			 			  {
			 				  System.out.print("<data_type>"); 
			 				  token = 'b';
			 			  }
			 			  else if(word[i].contains("double"))
			 			  {
			 				  System.out.print("<data_type>"); 
			 				  token = 'b';
	 			          }
			 			  break;
			 			  
			 	//Identifier
			 	case 'b': if(word[i].contains(""))
	 			  		  {
			 				  System.out.print("<identifier>");
	 			  			  if(word.length != 2)
	 			  			  {
	 				  		      token = 'c';
	 			  			  }
	 			  			  else
	 			  			  {
	 				  		      token = 'e';
	 				  		      i--;
	 			  			  }
	 			  		  }
			 			  else if(word[i].matches(".*[0-9]."))
			 			  {
			 				  System.out.print("<identifier>");
	 			  			  if(word.length != 2)
	 			  			  {
	 				  		      token = 'c';
	 			  			  }
	 			  			  else
	 			  			  {
	 				  		      token = 'e';
	 				  		      i--;
	 			  			  }
			 			  }
			 			  break;
			 			  
			 	//Assignment Operator
			 	case 'c': if(word[i].contains("="))
	 			  		  {
	 				  		  System.out.print("<assignment_operator>"); 
	 				  		  token = 'd';
	 			  		  }
			 			  break;
			 			  
			 	//Value
			 	case 'd': if(word[i].contains("\""))
	 			  		  {
	 				  		  System.out.print("<value>");
	 				          token = 'e';
	 			  		  }
			 			  else if(word[i].contains("'"))
		  		          {
			 				  System.out.print("<value>");
			  		          token = 'e';
		  		          }
			 			  else if(word[i].matches(".*[0-9]."))
	 			  		  {
	 				  		  System.out.print("<value>");
	 				  		  token = 'e';
	 			  		  }
			 			  i--;
			 			  break;
			 	
			 	//Delimiter
			 	case 'e': if(word[i].contains(";"))
	 			  		  {
			 					System.out.print("<delimiter>");
	 			  		  }
			 			  break;
			 } 
		 }
	}
	
}
		 