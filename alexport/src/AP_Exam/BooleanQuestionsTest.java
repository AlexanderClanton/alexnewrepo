package AP_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Util.ConsoleMethods;

/**
 * This class presents the series of questions based on boolean operators and logic
 * 
 * @author Anthony Tseng & Jude Giolitto
 */
public class BooleanQuestionsTest extends Question
{		
	private String[] boolOp1 = {"^", "||", "&&", "==", "!="};
	private String[] boolOp2 = {"!", ""};
	private int[] offset = { aOffset, bOffset, cOffset, dOffset, eOffset };
	
	public BooleanQuestionsTest()
	{
		setupQuestion();
	}
	/**
	 * setupQuestion is the method that sets up questions, choices, and answers
	 * 
	 */
	@Override
	protected void setupQuestionData()
	{
		Random rand = new Random();
		int random = rand.nextInt(3);
		ArrayList<String> questArray = new ArrayList<>(); //Creates ArrayList to hold answers
		
		switch(random)
		{
		case 0:
			questArray.addAll(Arrays.asList("^", "||", "!=", "%")); //add answer choices to questArray
			randomizeQuest(questArray);
			
			this.question = "Which of the following is NOT a boolean operator?\n"
						  + "^, ||, !=, %";
			choiceA = questArray.get(offset[0]);
			choiceB = questArray.get(offset[1]);
			choiceC = questArray.get(offset[2]);
			choiceD = questArray.get(offset[3]);
			choiceE = "";
			this.answerKey = answers[3-offset[0]];
			this.answer = "Choice " + answerKey + " is correct. % is not a boolean operator";
			break;
		case 1:
			questArray.addAll(Arrays.asList("true", "false", "The code will not run"));
			
			this.question = "What is the output of the following code?\n"
						  + "if(3 < 5)\n"
						  + "{\n"
						  + "    System.out.println( false && false );\n"
						  + "}";
			this.choiceA = questArray.get(0);
			this.choiceB = questArray.get(1);
			this.choiceC = questArray.get(2);
			this.choiceD = "Don't pick this one";
			this.choiceE = "Or this one";
			this.answerKey = getAns(questArray, "false");
			this.answer = "Choice " + answerKey + " is correct. The boolean operator && only returns true if both arguments are true.";
			break;
		case 2:
			ArrayList<String> qArray = createQuestion();
			this.question = qArray.get(0);
			this.choiceA = qArray.get(1);
			this.choiceB = qArray.get(2);
			this.choiceC = "Don't";
			this.choiceD = "Choose";
			this.choiceE = "These";
			this.answerKey = qArray.get(3).charAt(0);
			this.answer = "Choice " + answerKey + " is correct. " + qArray.get(4);
			break;
		default:
			System.out.print("ERROR at BooleanQuestions.setupQuestion");
		}
	}
	
	/**
	 * method that randomizes an ArrayList based on its size
	 * 
	 * @param quest the ArrayList to randomize
	 * @return the randomized ArrayList
	 */
	private void randomizeQuest(ArrayList<String> quest) //randomizes order of answer choices using ArrayList
	{		
		ConsoleMethods.print("BooleanQuestionsTest class randomizeQuest method");
		Random rand = new Random();
		choiceOffset = rand.nextInt(quest.size());
		
		int modBase = quest.size();
		
		for(int i = 0; i < quest.size(); i++)
		{
			offset[i] = (choiceOffset + i) % modBase;
		}
	}
	
	/**
	 * 
	 * @param quest the ArrayList containing answer choices
	 * @param ans the answer of datatype String
	 * @return the character pertaining to the answer
	 */
	private char getAns(ArrayList<String> quest, String ans) //determines correct answer by comparing strings
	{
		char answer = 'X';
		
		for( int i = 0; i < quest.size(); i++ )
		{
			if(quest.get(i).contentEquals(ans))
			{
				answer = (char)(i+'A');
				break;
			}
		}
		
		return answer;
	}
	
	/**
	 * creates question 3(case 2) in the setupQuestion class
	 * 
	 * @return an ArrayList containing the question, answer choices, answer, and explanation
	 */
	private ArrayList<String> createQuestion() //creates randomized question based on boolean operators
	{
		Random rand = new Random();
		ArrayList<String> qArray = new ArrayList<>();
		
		String OP = boolOp1[rand.nextInt(boolOp1.length)]; //randomly selects operator
		String OP2 = boolOp2[rand.nextInt(boolOp2.length)]; //selects whether there will be ! before first argument or not
		boolean arg1 = rand.nextBoolean(); //randomize arguments
		boolean arg2 = rand.nextBoolean();
		
		String question;
		question = String.format("What is " + OP2 + arg1 + " " + OP + " " + arg2 + "?"); //create question
		qArray.add(question); //adds question at index 0
		
		qArray.add("true"); //adds answer choices A and B at index 1 and 2, respectively
		qArray.add("false");
		
		boolean answer = true;
		String explanation = "";
		
		switch(OP) //determines answer and sets explanation
		{
		case "^":
			explanation = "^  is an operator that provides true if both arguments are different and false if both arguments are equal";
			if(OP2 == "")
			{
				answer = arg1^arg2;
			}
			else
			{
				answer = !arg1^arg2;
			}
			break;
		case "||":
			explanation = "|| is an operator that returns true if EITHER of the arguments are true and false if both arguments are false";
			if(OP2 == "")
			{
				answer = arg1||arg2;
			}
			else
			{
				answer = !arg1||arg2;
			}
			break;
		case "&&":
			explanation = "&& is an operator that returns true if and only if BOTH arguments are true. Otherwise, it returns false";
			if(OP2 == "")
			{
				answer = arg1&&arg2;
			}
			else
			{
				answer = !arg1&&arg2;
			}
			break;
		case "==":
			explanation = "== is an operator that returns true if both arguments are the same and false if they are different";
			if(OP2 == "")
			{
				answer = arg1==arg2;
			}
			else
			{
				answer = !arg1==arg2;
			}
			break;
		case "!=":
			explanation = "!= is an operator that return true if both arguments are unequal";
			if(OP2 == "")
			{
				answer = arg1!=arg2;
			}
			else
			{
				answer = !arg1!=arg2;
			}
			break;
		default:
			System.out.println("ERROR at BooleanQuestion.createQuestion");
		}
			
		if(answer)//determines letter that corresponds to answer and adds it at index 3
		{
			qArray.add("A");
		}
		else
		{
			qArray.add("B");
		}
		
		qArray.add(explanation);//adds explanation at index 4
		
		//displays question and answer in console for debugging purposes
		displayConsole(qArray.get(0), qArray.get(3));
		
		return qArray;
	}
	
	private void displayConsole(String quest, String ans)
	{
		ConsoleMethods.println(quest);
	}
}
