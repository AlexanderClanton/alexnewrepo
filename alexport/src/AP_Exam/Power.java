package AP_Exam;
import java.util.Random;
import java.util.Formatter;

import Util.ConsoleMethods;

public class Power extends Question{
	/**
	 *  Author: Alex Clanton, Mithil Pujar
	 *	Power Button, rando questions and answers
	 *
	 *
	 *	Ver 1.0
	 */
	
	
	public Power()
    {
    	setupQuestionData();
    	setupQuestion();
    }
	
	 @Override
	protected void setupQuestionData() {
		/**
		 * setup the question 
		 */
		 ConsoleMethods.println("Power class setup QuestionData method");
        //fix
    	    

		Random rand = new Random();
		int rando = (int) Math.floor(Math.random()*4);
		Integer num1 = rand.nextInt(50);
    	Integer num2 = rand.nextInt(20);
		int hold;
		
		String[] pick = new String[5];
		
		int zero =2;

		switch(rando){
		/**
		 * every case is a question, with the order of questions and answers randomized
		 * done via arrays and a 2 method calls
		 *
		 *
		 */
		
		
		case 0://q1
			
			
			this.question = "What Iteration is a controlled by a programmer variable choice";
			
			pick = loadArray("Do While","Switch Case", "For", 
					"If,Else,For", "Thats done by the user");//array for stroing answers
			
			this.choiceA = pick[0];//choices A-E loaded in
			this.choiceB = pick[1];
			this.choiceC = pick[2];
			this.choiceD = pick[3];
			this.choiceE = pick[4];
			
			
			
			this.answerKey = Ans(pick,"For");
			this.answer = "U got it homes";//encouragement
			break;
		
		case 1://q2
			this.question = "What is the correct format for writing a for loop?";
			pick=loadArray("For:", "for(int z=12; z<=103; z++);" ,"for{in i=1: i<6:}", "for {int i = 1: i<=6:} ()", "for: a=1, b=2, i++" );
			
			this.choiceA = pick[0];//loaded in answers
			this.choiceB = pick[1];
			this.choiceC = pick[2]; //comment
			this.choiceD = pick[3];
			this.choiceE = pick[4];
			
			this.answerKey = Ans(pick,"for(int z=12; z<=103; z++);");//correct answer choice check
			this.answer = "U got it homes";
			break;
		
		case 2://q3
			
			this.question = "Which of the following is most closely associated with iterations?";
			pick=loadArray("loops such as for loops","Recursion","Instance Initialization","Public Static Void","if else statements");
			
			this.choiceA = pick[0];
			this.choiceB = pick[1];
			this.choiceC = pick[2];
			this.choiceD = pick[3];
			this.choiceE = pick[4];
			this.answerKey = Ans(pick,"loops such as for loops");
			this.answer = "U got it homes";
			break;
		case 3://q4
		
			this.question = "What is the function of a do while loop?";
			pick=loadArray("to replace a for loopo in all cases for shortening code","Recursion only","Executing a block of code at least once and then repeatedly executing it based on a boolean condition","Allowing code to be repeatedly executed","To create simultaneous control flows for simplified code");
			
			this.choiceA = pick[0];
			this.choiceB = pick[1];
			this.choiceC = pick[2];
			this.choiceD = pick[3];
			this.choiceE = pick[4];
			this.answerKey = Ans(pick,"Executing a block of code at least once and then repeatedly executing it based on a boolean condition");
			this.answer = "U got it homes";
			break;
		
			
		/*
		case 4://q5 //rando question
			System.out.println("Q5");
			this.question = "Whats" + num1 + "% " + " (int)" + num1;
			
			//this.question = String.format("What is " + arg2 + "%"  + arg3);
	        
	        // format question choices
	        this.choiceA = String.format("%f",(float)num1/(float)num2);
	        this.choiceB = String.format("%i",num1+num2);
	        this.choiceC = String.format("%f",(float)num1*(float)num2);
	        this.choiceD = String.format("%x",num1%num2);
	        this.choiceE = "None of the above";
		
			//hold=arg2%arg3;
			//System.out.println(hold);
			
			//pick=loadArray("hold","8","15","40","3");
			
			
			
			
			/*
			this.choiceA = String.format("%i",hold);
			this.choiceB = String.format("%i", 6);
			this.choiceC = String.format("%i", 12);
			this.choiceD = String.format("%i", 3);
			this.choiceE = String.format("%i", 19);
			*/
			
			//this.answerKey = (char) (num1%num2);
			//this.answer = "U got it homes";
			
			//break;
		
		
		default:
			System.out.print("elproblem");//default case issue
		
		
		}
	}

	private String[] loadArray (String ques1, String ques2, String ques3, String ques4, String ques5)//all choices passed as an argument
	{
		/**
		 *  loadarray is used to take the 4 answer choices and randomize them in an array, then return the choice
		 *
		 *
		 *
		 */
		
		int rando; //random int placehold
		String[] pick = new String[5]; //temporary storage for questions
		
		String hold; //for swap algo
		
		//load questions into array
		pick[0] = ques1;
		pick[1] = ques2;//load possible choices
		pick[2] = ques3;
		pick[3] = ques4;
		pick[4] = ques5;
		
		
		for(int i = 0; i <5; i++)//bubble sort!!! for choice
		{
			hold = pick[i];
			rando = (int) Math.floor(Math.random() * 5);
			pick[i] = pick[rando];
			pick[rando] = hold;
			
		}
		return pick;	//retuns the answers randomized
	}
	
	/**
	 *  answer choice check to find if they are true then return that value as an char
	 * 
	 * @param ques
	 * @param an
	 * @return
	 */
	private char Ans(String ques[], String an) {
		char ret;//check the correct versus input
		
		
		if(ques[0].equals(an) == true)//see if the answer choice is correct, and return
			ret = 'A';
		else if(ques[1].equals(an) == true)
			ret = 'B';
		else if(ques[2].equals(an) == true)
			ret = 'C';
		else if(ques[3].equals(an) == true)
			ret = 'D';
		else if(ques[4].equals(an) == true)
			ret = 'E';
		else ret = 'Z'; //error problem problem
		//alex mithil
		return ret;
	}
	
}
	
	
	
