package javaPackage;
import java.util.Scanner;

public class DFATester 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		 
		System.out.println("---DFA Tester (for String ending with '01')---\n");
		//Accept - 101, 001, 1001, 100101, 10011001...
		//Reject - 010, 011, 0110, 110110, 11011011...
		
		System.out.print("Enter String of 0's and 1's: ");
		String input = scan.nextLine();
		
		//Checking if String consists of only 0's and 1's
		int i = 0;
		while (i < input.length()) 
		{
		    if ((input.charAt(i) != '0') && (input.charAt(i) != '1'))
		    {
		        break;
		    }
		    else
		    {
		        i++;
		    } 
		}
		
		//if String consists of only 0's and 1's
		if (i == input.length())
		{
			char state = '0';
			int j = 0;
			while(j < input.length())
			{
				switch(state)
				{
					//State >q0
					case '0': if(input.charAt(j) == '0')
						      {
						  		  state = '1';
						      }
							  else if(input.charAt(j) == '1')
							  {
								  state = '0';
							  }
						      break;
				    
				    //State q1
					case '1': if(input.charAt(j) == '0')
						      {
								  state = '1';
						      }
					  		  else if(input.charAt(j) == '1')
					  		  {
					  			  state = '2';
					  		  }
				              break;
					
				    //State *q2
					case '2': if(input.charAt(j) == '0')
						      {
						  		  state = '1';
						      }
					          else if(input.charAt(j) == '1')
					          {
					        	  state = '0';
					          }
				              break;
				}	
			    j++;	
			}
			
			if(state == '2')
	        {
	            System.out.print("The input String does ends with '01'." + 
	                             "\nTherefore, '" + input + "' is ACCEPTED.");
	        }
	        else
	        {
	        	System.out.print("The input String does not ends with '01'." + 
	                             "\nTherefore, '" + input + "' is REJECTED.");
	        }
		}
		//if String consists of not only 0's and 1's
		else
		{
			System.out.print("\nInvalid input. String must consists of only 0's and 1's.");
		}			
	}

}
