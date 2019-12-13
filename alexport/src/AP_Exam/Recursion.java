package AP_Exam;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Util.ConsoleMethods;

/**
 * 
 * @author Mateo
 * @version version 1.0
 */
public class Recursion extends Question
{

	private String[] ansq = new String[5]; //string array that holds all of the answers
	private char[] ansc = {'A', 'B', 'C', 'D', 'E'}; //character array to hold a, b, c, d, and e
	private int correct; //number of the correct substring of the answer array
	private String ans; //String that contains the correct answer
	
	public Recursion()
	{
		super.setupQuestion();
	}
	
	@Override
	public void setupQuestionData() //question method
	{
		ConsoleMethods.println("Recursion class setupQuestionData method");
		int bruh = (int)(Math.random() * 4 + 1); //	randomize this number to choose a question
		switch (bruh) //switch case for questions
		{
			case 1: //question #1
				ans = "248832"; //correct answer
				
				this.question = "Consider the following code:\r\n" + //display the question
				                "\r\n" + 
				                "\r\n" + 
				                "public static void main(String[] args)\r\n" + 
				                "{\r\n" + 
				                "   System.out.println(equation(8));\r\n" + 
				                "}\r\n" + 
				                "\r\n" + 
				                "public static int equation(int a)\r\n" + 
				                "{\r\n" + 
				                "   if(a <= 5)\r\n" + 
				                "      return 12;\r\n" + 
				                "   return equation(a-2) * equation(a-1);\r\n" + 
				                "}\r\n" + 
				                "\r\n" + 
				                "What is the output for the code above?";
				
				ansq[0] = "144"; //answer choices
				ansq[1] = "48";
				ansq[2] = "1728";
				ansq[3] = "248832";
				ansq[4] = "104";
				
				shuffle(); //shuffle the array
				answers(); //display the answers
				break;
			case 2: //question #2
				ans = "public long factorial(long a)\r\n" + //correct answer 
					  "{\r\n" + 
					  "     if(a <= 1)\r\n" + 
					  "         return 1;\r\n" + 
					  "\r\n" + 
					  "     return a * factorial(a-1);\r\n" + 
					  "}";
				
				this.question = "Which of the following is a recursive factorial function?  \r\n" + //display the question
						        "Recall that an example of a factorial is: \r\n" + 
						        "\r\n" + 
						        "5!=5*4*3*2*1";
				
				ansq[0] = "public long factorial(long a)\r\n" + //answer choices
						  "{\r\n" + 
						  "    return a * factorial(a-1) * factorial(a-2);\r\n" + 
						  "}";
				ansq[1] = "public long factorial(long a)\r\n" + 
						  "{\r\n" + 
						  "    long ret = 1;\r\n" + 
						  "\r\n" + 
						  "    for(int i = 2; i < a; i++)\r\n" + 
						  "        ret *= i;\r\n" + 
						  "\r\n" + 
						  "    return ret;\r\n" +
						  "}";
				ansq[2] = "public long factorial(long a)\r\n" + 
						  "{\r\n" + 
						  "     if(a <= 1)\r\n" + 
						  "         return 1;\r\n" + 
						  "\r\n" + 
						  "     return a * factorial(a-1);\r\n" + 
						  "}";
				ansq[3] = "public long factorial(long a)\r\n" + 
						  "{\r\n" + 
						  "    a * a-1 * a-2 * a-3 * a-4;\r\n" + 
						  "}";
				ansq[4] = "None of these";
				
				shuffle(); //shuffle the answers
				answers(); //display the answers
				break;
			case 3: //question #3
				ans = "tHISISMYFAVORITEyAYFORPROGRAMMING"; //correct answer
				
				this.question = "Consider the following code:\r\n" + //display the question
						        "\r\n" + 
						        " \r\n" + 
						        "\r\n" + 
						        "public static void main(String[] args)\r\n" + 
						        "{\r\n" + 
						        "     System.out.println(foo(\"This is my favorite: Yay for programming!!!\"));\r\n" +
						        "\r\n" + 
						        "public static String foo(String s)\r\n" + 
						        "{\r\n" + 
						        "    if(!s.equals(\"\"))\r\n" + 
						        "    {\r\n" + 
						        "        char c = s.charAt(0);\r\n" + 
						        "\r\n" + 
						        "        if(c >= 'A' && c <= 'Z')\r\n" + 
						        "            return Character.toLowerCase(c) + foo(s.substring(1));\r\n" + 
						        "        else\r\n" +
						        "            if (c >= 'a' && c <= 'z')\r\n" + 
						        "                return Character.toUpperCase(c) + foo(s.substring(1));\r\n" + 
						        "\r\n" + 
						        "        return foo(s.substring(1));\r\n" +
						        "    }\r\n" + 
						        "\r\n" + 
						        "    return \"\";\r\n" + 
						        "}\r\n" + 
						        "\r\n" + 
						        "What is the output for the main function above?";
				
				ansq[0] = "ThIs iS mY fAvOriTe: YaY fOr PrOgRaMmIng!!!"; //answer choices
				ansq[1] = "tHIS IS MY FAVORITE: yAY FOR PROGRAMMING!!!";
				ansq[2] = "tHIS IS MYFAVORITE";
				ansq[3] = "tHISISMYFAVORITEyAYFORPROGRAMMING";
				ansq[4] = "ThIs iS mY fAvOriTe";
				
				shuffle(); //shuffle the answers
				answers(); //display the answers
				break;
			case 4:
				ans = "24"; //correct answer
				
				this.question = "public static int foo(int a, int b)\r\n" + //display the question
								"{\r\n" + 
								"    if(b <= 1 || b <= a)\r\n" + 
								"        return 1;\r\n" + 
								"\r\n" + 
								"    return (b - a) * foo(a,b-1);\r\n" +
								"}\r\n" + 
								"\r\n" + 
								"Based on the code above, what is the value of the following function call:\r\n" +
								"foo(5,9);";
				
				ansq[0] = "36"; //answer choices
				ansq[1] = "24";
				ansq[2] = "32";
				ansq[3] = "18";
				ansq[4] = "16";
				
 				shuffle(); //shuffle the answers
				answers(); //display the answers
				break;
			case 5:
				ans = "Error, infinite loop"; //correct answer
				
				this.question = "public void draw()\r\n" + //display the question
								"{\r\n" + 
								"  recurs(11);\r\n" + 
								"}\r\n" + 
								"void recurs(int count)\r\n" + 
								"{\r\n" +
								"    if (count == 0)\r\n" + 
								"        return;\r\n" + 
								"    else\r\n" + 
								"    {\r\n" +
								"        System.out.print(count + \" \");\r\n" + 
								"        int recount = count - 2;\r\n" + 
								"        recurs(recount);\r\n" + 
								"        return;\r\n" + 
								"    }\r\n" + 
								"}";
				
				ansq[0] = "11 9 7 5 3 1 -1"; //answer choices
				ansq[1] = "9 7 5 3 1";
				ansq[2] = "9 7 5 3 1 -1";
				ansq[3] = "11 9 7 5 3 1";
				ansq[4] = "Error, infinite loop";
				
				shuffle(); //shuffle the answers
				answers(); //display the answers
				break;
		}
		
		
	}
	private int shuffle() //shuffle function
	{
		int num = ansq.length; //get the length of the string array
		
		for(int i = 0; i < num; i++) //repeat until end of array is reached
		{
			Random rnd = ThreadLocalRandom.current(); 
			int s = rnd.nextInt(i + 1); //get a random integer
			
			String temp = ansq[s]; //sorting process
			ansq[s] = ansq[i];
			ansq[i] = temp;
			
			if (ans.equals(ansq[i])) //if the strings are equal, correct gets that substring number
				correct = i;
		}
		
		return correct; //return the correct answer
	}
	
	private void answers() //displaying answer method
	{
		this.choiceA = ansq[0]; //display answers
		this.choiceB = ansq[1];
		this.choiceC = ansq[2];
		this.choiceD = ansq[3];
		this.choiceE = ansq[4];
		this.answer = ansq[correct];
		this.answerKey = ansc[correct];
	}
}
