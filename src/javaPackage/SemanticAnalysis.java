package javaPackage;

import java.util.Scanner;

public class SemanticAnalysis
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("---Semantic Analysis ---\n\n");

        System.out.print("Enter Expression: ");
        String entStatement = input.nextLine();

        String word[] = entStatement.split(" ");
        String lastWord = word[word.length - 1];

        //Length = 2
        if(word.length == 2)
        {
            word[1] = word[1].replaceAll("[^a-zA-Z0-9]","");

            if(word[0].contains("String") || word[0].contains("char"))
            {
                if(word[1].matches("^[A-Za-z0-9]*$"))
                {
                    System.out.println("Semantically Correct!");
                }
                else
                {
                    System.out.println("Semantically Incorrect!");
                }
            }
            else if(word[0].contains("int") || word[0].contains("double"))
            {
                if(word[1].matches("^[A-Za-z0-9]*$"))
                {
                    System.out.println("Semantically Correct!");
                }
                else
                {
                    System.out.println("Semantically Incorrect!");
                }
            }
            else
            {
                System.out.println("Error");
            }
        }

        //Length = more than 2
        else if(word.length > 2)
        {
            //String
            if(word[0].contains("String"))
            {
                char first = word[3].charAt(0);
                char last = lastWord.charAt(lastWord.length() - 2);

                if(first == '"' && last == '"')
                {
                    System.out.println("Semantically Correct!");
                }
                else
                {
                    System.out.println("Semantically Incorrect!");
                }

            }
            //char
            else if(word[0].contains("char"))
            {
                char first = word[3].charAt(0);
                char last = word[3].charAt(word[3].length() - 2);

                if(word[3].length() == 4)
                {
                    if(first == '\'' && last == '\'')
                    {
                        System.out.println("Semantically Correct!");
                    }
                    else
                    {
                        System.out.println("Semantically Incorrect!");
                    }
                }
                else
                {
                    System.out.println("Semantically Incorrect!");
                }

            }
            //int
            else if(word[0].contains("int"))
            {

                if(word[3].contains("-"))
                {
                    word[3] = word[3].replaceAll("-", "");
                }

                String intgr = word[3].replaceAll(";", "");
                if(intgr.matches("\\d*"))
                {
                    System.out.println("Semantically Correct!");
                }
                else
                {
                    System.out.println("Semantically Incorrect!");
                }

            }
            //double
            else if(word[0].contains("double"))
            {
                if(word[3].contains("-"))
                {
                    word[3] = word[3].replaceAll("-", "");
                }
                if(word[3].contains("\"") || word[3].contains("'"))
                {
                    System.out.println("Semantically Incorrect!");
                }
                else if(word[3].contains("."))
                {
                    String dbl = word[3].replaceAll("[^a-zA-Z0-9]", "");

                    if(dbl.matches("\\d*"))
                    {
                        System.out.println("Semantically Correct!");
                    }
                    else
                    {
                        System.out.println("Semantically Incorrect!");
                    }
                }
                else
                {
                    System.out.println("Semantically Incorrect!");
                }
            }
            else
            {
                System.out.println("Error");
            }
        }
    }

}
