package AP_Exam;

import java.util.Arrays;
import java.util.Random;

import Util.ConsoleMethods;

import java.util.Collections;
import java.util.List;

/**
 * Power and Square Root Question Setup. 
 * Questioning the user based on the two functions from the math package, sqrt and pow
 *
 * @author Evan Knaggs, Neo Argatides
 * @version 12/6/2019
 * 
 */
public class PowSqrt extends QuestionRandom
{ 
	private char[] operators = {'1', '2'};
	
    /**
     * Constructor for objects of class PowSqrt
     */
    public PowSqrt()
    {
    	super.setupQuestion();	// this depends on setupQuestionData override
    }
 
    public static String mainTest ()
    {
    	Question q = new MathQuestions();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }
    
    /**
     * PowSqrt
     *
     * @param  square      argument for exponents
     * @param  which  operator in math expression (pow / sqrt)
     * @param  root      argument for square roots
     * @return    error code
     */
	@Override
    protected void setupQuestionData()
    {
		Random rand = new Random();
    	
    	Integer square = rand.nextInt(30) + 1;
    	Integer root = rand.nextInt(25) + 1;

    	//Integer choose = rand.nextInt(2);   	
    	Integer opIndex = rand.nextInt(operators.length);
    	char which = operators[opIndex];
		
    	Float[] array = new Float[4]; // allows for randomization of questions
    	List<Float> randArr = Arrays.asList(array); // randomization of questions
    	
    	
		//question option for pow or sqrt (formats the question)
		if(which == '1')
		{
			this.question = String.format("What is pow(" + square + ", 2)?");
		}
		else
		{
			this.question = String.format("What is sqrt(" + root + ")?");
		}
		
		array[0] = (float)square * (float)root;
		array[1] = (float)Math.pow((float)square, 2);
		array[2] = (float)square / (float)root;
		array[3] = (float)Math.sqrt((float)root);
		
		//Collections.shuffle(randArr);
		
        // format question choices (randomized)
		ConsoleMethods.println("PowSqrt class setupQuestionData method");
        this.choiceA = String.format("%f",array[0]);
        this.choiceB = String.format("%f",array[1]);
        this.choiceC = String.format("%f",array[2]);
        this.choiceD = String.format("%f",array[3]);
        this.choiceE = "None of the above";
        
        
        // real time calc answer based off args AND operator
        double answerCalc;
        switch(which)
        {
            case '1': // exponents
            	answerCalc = Math.pow(square, 2);
                this.answerKey = this.charB;
                break;
            case '2': //square roots
            	answerCalc = Math.sqrt((float)root);
                this.answerKey = this.charD;
                break;
            default: // not supported
            
                return;
        }
        
        //formats answer into string from above switch case
        if(which == '1')
        {
        	this.answer = String.format("pow(" + square + ", 2) = " + answerCalc);
        }
        else
        {
        	this.answer = String.format("sqrt(" + root + ") = " + answerCalc);
        }
        
        
    }
    
}
