package javaPackage;

import java.util.Scanner;

public class SyntaxAnalysis
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("---Syntax Analysis ---\n\n");

        System.out.print("Enter Tokens: ");
        String entTokens = input.nextLine();

        if(checkSyntax(entTokens))
        {
            System.out.println("Syntax is Correct!");
        }
        else
        {
            System.out.println("Syntax is Error!");
        }
    }

    public static boolean checkSyntax(String entTokens)
    {
        String word[] = entTokens.split(" ");
        char j = 'a';

        for(int i = 0; i < word.length; i++)
        {
            switch(j)
            {
                //Data Type
                case 'a': if(word[i].contains("<data_type>"))
                {
                    j = 'b';
                }
                else
                {
                    return false;
                }
                    break;

                //Identifier
                case 'b': if(word[i].contains("<identifier>"))
                {
                    if(word.length == 5)
                    {
                        j = 'c';
                    }
                    else if(word.length == 3)
                    {
                        j = 'e';
                    }
                }
                else
                {
                    return false;
                }
                    break;

                //Assignment Operator
                case 'c': if(word[i].contains("<assignment_operator>"))
                {
                    j = 'd';
                }
                else
                {
                    return false;
                }
                    break;

                //Value
                case 'd': if(word[i].contains("<value>"))
                {
                    j = 'e';
                }
                else
                {
                    return false;
                }
                    break;

                //Delimiter
                case 'e': if(word[i].contains("<delimiter>"))
                {
                    j = 'a';
                }
                else
                {
                    return false;
                }
                    break;
            }
        }
        return true;
    }

}
