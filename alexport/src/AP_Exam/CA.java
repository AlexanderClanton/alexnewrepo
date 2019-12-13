package AP_Exam;
import java.util.Random;

import Util.ConsoleMethods;

/**
 * CA class
 * loads code analysis questions, extends Question class
 *
 * @author Lucy Gao, Cynthia Zhang
 * @version 12/6/19
 */

public class CA extends Question{
	/**
     * calls setupQuestion, which creates question template and loads in values - answers, choices, question
     */
	public CA()
    {
    	setupQuestionData();
    	setupQuestion();
    }
	
	// setupQuestion method
	/**
     * setupQuestion - method that sets up question,
     * includes switch case structure that picks the question to display based on 'random' variable
     * @param none
     * @return none
     */
	@Override 
	protected void setupQuestionData() {
        ConsoleMethods.println("what does this code do");
		// random - generates a random number between 0 and 8 inclusive
		// previous randomization way: int random = (int) Math.floor(Math.random()*9);
		// new randomization - using modulo, borrowed idea from other class
		Random rand = new Random();
		int random = rand.nextInt(9999999) % 9;
		
		// choose the question based on 'random' - ex: if random == 0, then use case 0 and display the first question
		switch(random){
		// first question - code analysis, switch case
		case 0:
			this.question = "Refer to the following code:\nswitch(ans)\n{\n     case 1:\n          ans = 11;\n          break;\n     case 2:\n          ans = 78;\n          break;\n}\n\nIf ans is 1, what is it after the switch case?";
			this.choiceA = "1";
			this.choiceB = "11";
			this.choiceC = "78";
			this.choiceD = "67";
			this.choiceE = "89";
			this.answerKey = this.charB;
			this.answer = "11";
			break;
		
		// second question - code analysis, randomization
		case 1:
			this.question = "Refer to the following code:\ndouble x = 10 * Math.random() + 3;\nSystem.out.println(x);\n\nWhat is the range of possible outputs?";
			this.choiceA = "(0,1)";
			this.choiceB = "[0,1)";
			this.choiceC = "[3,10)";
			this.choiceD = "(3,13)";
			this.choiceE = "[3,13)";
			this.answerKey = this.charE;
			this.answer = "[3,13)";
			break;
		
		// third question - matrices
		case 2:
			this.question = "int[][]  A  =  {{1,0,3},{7,-3,6},{2,-9,-1}};\nWhat int is in the 2nd row, 3rd column?";
			this.choiceA = "6";
			this.choiceB = "-9";
			this.choiceC = "-3";
			this.choiceD = "7";
			this.choiceE = "325";
			this.answerKey = this.charA;
			this.answer = "6";
			break;
			
		// fourth question - matrices
		case 3:
			this.question = "int[][]  A  =  {{1,0,3}, {7,-3,6}, {2,-9,-1}};\nWhat int is in the 3rd row, 1st column?";
			this.choiceA = "-9";
			this.choiceB = "2";
			this.choiceC = "3";
			this.choiceD = "6";
			this.choiceE = "0";
			this.answerKey = this.charB;
			this.answer = "2";
			break;
			
		// fifth question - matrices (2D arrays)
		case 4:
			this.question = "What is the code to write a matrix of the form: \n3    4    8    9 \n6  -1    4  10 ?";
			this.choiceA = "int[][]  A  =  {{3,4,8,9},{6,-1,4,10}};";
			this.choiceB = "int[][]  B  =  {{3,-1},{4,-1},{8,4},{9,10}};";
			this.choiceC = "int[][]  C  =  {{6,-1,4,10},{3,4,8,9}};";
			this.choiceD = "int[][]  D  =  {{3,4,8,9\\n6,-1,4,10}};";
			this.choiceE = "None of the above";
			this.answerKey = this.charA;
			this.answer = "int[][]  A  =  {{3,4,8,9},{6,-1,4,10}};";
			break;
			
		// sixth question - code analysis, typecasting
		case 5:
			this.question = "double x = 3.87;\nint y = (int)(x - 0.5);\nSystem.out.println(y);\n\nWhat will be printed?";
			this.choiceA = "3.87";
			this.choiceB = "3";
			this.choiceC = "4";
			this.choiceD = "The code will result in an error";
			this.choiceE = "None of the above";
			this.answerKey = this.charD;
			this.answer = "The code will result in an error";
			break;
			
		// seventh question - code analysis, typecasting
		case 6:
			this.question = "double x = -11.96;\nint y = (int)(x - 0.5);\nSystem.out.println(y);\n\nWhat will be printed?";
			this.choiceA = "-11";
			this.choiceB = "-12";
			this.choiceC = "-11.9";
			this.choiceD = "-11.96";
			this.choiceE = "-12.0";
			this.answerKey = this.charB;
			this.answer = "-12";
			break;
			
		// eighth question - analyzing code snippet, methods and calling/passing, return values
		case 7:
			this.question = "Refer to the code below:\n" +
					"public static void main(String[] args)\n" +
					"    {\n" +
					"        int num = 4;\n" +
					"        System.out.println(abc(4));\n" +
					"    }\n" +
					"static int abc(int n)\n" +
					"    {\n" +
					"        if (n == 0)\n" +
					"          return 1;\n" +
					"        return n*abc(n-1);\n" +
					"    }\n\nWhat is printed?";
			this.choiceA = "60";
			this.choiceB = "0";
			this.choiceC = "24";
			this.choiceD = "12";
			this.choiceE = "120";
			this.answerKey = this.charC;
			this.answer = "24";
			break;
			
		// ninth question - analyzing code snippet, for loops, matrices
		case 8:
			this.question = "Refer to the code below:\nint[][]  A  =  {{1,0,12},{ 7, -3, 2}};\n" +
					"int x, y;\n" +
					"for (x = 0; x <= 2; x++)\n" +
					"{\n" +
					"     for (y = 0; y <= 1; y++)\n" +
					"     {\n" +
					"            System.out.print(\" \"+A[y][x]);\n" +
					"     }\n" +
					"System.out.println(\"\");\n\nWhat will be printed?";
			this.choiceA = "1 7\n    0 3\n    12 2";
			this.choiceB = "1 0 12 7 -3 2";
			this.choiceC = "1 0 12\n    7 -3 2";
			this.choiceD = "0 2 11 8 6 7";
			this.choiceE = "None of the above";
			this.answerKey = this.charA;
			this.answer = "1 7\n    0 3\n    12 2";
			break;
		
		// if an error occurs
		default:
			System.out.print("ERROR");
		}
	}
}