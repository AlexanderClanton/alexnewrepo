package AP_Exam;

import java.util.ArrayList; 
import java.util.Random;

import Util.ConsoleMethods;

/**
 * 
 * This class generates random MC arraylist questions <br>
 * It also does the following: 
 * <li> randomizes the numbers in the list in question 
 * <li> randomizes the order of the answers 
 * <li> returns the correct answer <br>
 * <br>
 * 
 * @author Anika Sood and Aashi Mittal <br>
 * (Period: 4)
 * 
 * 
 * @version (3.0)<br>
 * name: ListQuestions2 (Dec. 9th) 
 * 
 * 
 * 
 */

public class ListQuestions2 extends Question

{
	/**
	 * Constructor for objects of class ListQuestions2
	 * no parameters needed 
	 * 
	 */
	public ListQuestions2()
	{
		setupQuestionData();
		setupQuestion();
	}
	

	public int getRandNum() //method to generate random numbers to fill the arrays
	{
		Random rand = new Random();
		return(rand.nextInt(10));
	}
	
	/**
	 * main method to set up question and answer choices in the string format defined in the Question class
	 */
	 
	@Override 
	protected void setupQuestionData()
	{
        ConsoleMethods.println("ListQuestions2 class setupQuestion method");

		Random rand = new Random(); 

		//getting random numbers to fill array
		int num1=getRandNum(), num2=getRandNum(), num3=getRandNum(), num4=getRandNum(), num5 = getRandNum(), num6 = getRandNum();
		

		this.question = String.format("What is the value stored in list when:\nArrayList<Integer> list = new ArrayList<Integer>();\nlist.add(%d); \nlist.add(%d); \nlist.add(%d); \nlist.add(%d); \nlist.remove(2); \nlist.add(%d); \nlist.add(%d); \nlist.remove(1); \nlist.set(1, %d);", num1, num2, num3, num4, num5, num6, num6);
		
		//correct answer
		this.answer =  String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
		//%d is the format() format for an integer to print
		
		
	    //Random numbers generating
	    int option = rand.nextInt(5); 
	    int option2 = rand.nextInt(5);
	    while(option2 == option)
	    {
	    	option2 = rand.nextInt(5); 
	    } 
	    
	    int option3 = rand.nextInt(5);
	    
	    while(option3==option || option3 ==option2)
	    {
	    	option3 = rand.nextInt(5);
	    }
	    
	    int option4= rand.nextInt(4);
	    while(option4==option3 || option4 ==option2 || option4 == option)
	    {
	    	option4 = rand.nextInt(5);
	    }
		int option5 = rand.nextInt(4); 
		while (option5==option4 || option5 ==option3 || option5 ==option2 ||option5 ==option) 
		{
			option5= rand.nextInt(5);
		}
		
		//putting each answer choice into the random places that were generated
		switch(option)
		{
			case 0:
				this.choiceA= String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
				break;
			case 1:
				this.choiceB= String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
				break;
			case 2:
				this.choiceC= String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
				break;
			case 3:
				this.choiceD= String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
				break;
			case 4:
				this.choiceE= String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
				break;
		}
		switch(option2)
		{
			case 0:
				this.choiceA= String.format("[%d, %d, %d, %d, %d]", num2, num4, num4, num5, num6);
				break;
			case 1:
				this.choiceB= String.format("[%d, %d, %d, %d, %d]", num2, num4, num4, num5, num6);
				break;
			case 2:
				this.choiceC= String.format("[%d, %d, %d, %d, %d]", num2, num4, num4, num5, num6);
				break;
			case 3:
				this.choiceD= String.format("[%d, %d, %d, %d, %d]", num2, num4, num4, num5, num6);
				break;
			case 4:
				this.choiceE= String.format("[%d, %d, %d, %d, %d]", num2, num4, num4, num5, num6);
				break;
		}
		switch(option3)
		{
			case 0:
				this.choiceA= String.format("[%d, %d, %d, %d, %d]", num1, num3, num4, num2, num3);
				break;
			case 1:
				this.choiceB= String.format("[%d, %d, %d, %d, %d]", num1, num3, num4, num2, num3);
				break;
			case 2:
				this.choiceC= String.format("[%d, %d, %d, %d, %d]", num1, num3, num4, num2, num3);
				break;
			case 3:
				this.choiceD= String.format("[%d, %d, %d, %d, %d]", num1, num3, num4, num2, num3);
				break;
			case 4:
				this.choiceE= String.format("[%d, %d, %d, %d, %d]", num1, num3, num4, num2, num3);
				break;
		}
		
		switch(option4)
		{
		    case 0: 
		    	this.choiceA = String.format("[%d, %d, %d, %d, %d]", num2, num6, num4, num1, num6);
		    	break; 
		    case 1:
		    	this.choiceB = String.format("[%d, %d, %d, %d, %d]", num2, num6, num4, num1, num6);
		    	break; 
		    case 2:
		    	this.choiceC = String.format("[%d, %d, %d, %d, %d]", num2, num6, num4, num1, num6);
		    	break;
		    case 3:
		    	this.choiceD = String.format("[%d, %d, %d, %d, %d]", num2, num6, num4, num1, num6);
		    	break;
		    case 4:
		    	this.choiceE= String.format("[%d, %d, %d, %d, %d]", num2, num6, num4, num1, num6);
		    	break;
		}
		
		switch(option5) 
		{
		    case 0: 
		    	this.choiceA = String.format("[%d, %d, %d, %d, %d]", num3, num6, num4, num5, num6);
		    	break; 
		    case 1:
		    	this.choiceB = String.format("[%d, %d, %d, %d, %d]", num3, num6, num4, num5, num6);
		    	break; 
		    case 2: 
		    	this.choiceC = String.format("[%d, %d, %d, %d, %d]", num3, num6, num4, num5, num6);
		    	break; 
		    case 3:
		    	this.choiceD = String.format("[%d, %d, %d, %d, %d]", num3, num6, num4, num5, num6);
		    	break; 
		    case 4: 
		    	this.choiceE = String.format("[%d, %d, %d, %d, %d]", num3, num6, num4, num5, num6);
		        break;                
		}
}
	        
	        

}


