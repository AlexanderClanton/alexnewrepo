package AP_Exam;


import java.util.Random;
import java.util.logging.*;

import Util.ConsoleMethods;	// Console support

/**
 * Question class is intended to support asking question on test
 *liuol
 * @author alex c
 * @version (1.0)
 */
public class Question extends Scoring
{
	
	private final static Logger LOGGER= Logger.getLogger(Question.class.getName());
	
	static final String path = "hash/resources/log4j.properties";
	//static Logger log4j = Logger.getLogger(Question.class);
	// question setup values
	protected String question, choiceA, choiceB, choiceC, choiceD, choiceE, answer;
	protected char answerKey;
    
    // internal control values, these are never change
    protected final char charA = 'A', charB = 'B', charC = 'C', charD = 'D', charE = 'E'; 	// Multiple choice default letters
	protected final char[] answers = {charA, charB, charC, charD, charE};					// Multiple choice default order
   	protected int aOffset = 0, bOffset = 1, cOffset = 2, dOffset = 3, eOffset = 4;			// Multiple choice index value
    
    // defaults for choice
   	protected int choiceOffset = 0;						// choiceOffset is used when scrambled to move answers around
    protected boolean choiceEfixed = true;				// used to keep choice E fixed versus randomization
	protected String[] choices = {"", "", "", "", ""};

    
    /**
     * Constructor for objects of class Question
     * 
     * @param  void
     */
	public static void main(String[] args) 
	
	{
		/*
        PropertyConfigurator.configure(path);
        log4j.debug("Sample debug message");
        log4j.info("Sample info message");
        log4j.warn("Sample warn message");
        log4j.error("Sample error message");
        log4j.fatal("Sample fatal message");
    	*/
    }

	
	public Question()
    {
    	// This outputs constructor being run
        //ConsoleMethods.println("Question class constructor");
		LOGGER.info("Info Print: "+LOGGER.getName());
    	//ConsoleMethods.println("Question class constructor");
    	 
    	 LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
         
         //An array of size 3
         int []a = {1,2,3};
         int index = 4;
         LOGGER.config("index is set to "+index);
          
         try{
             System.out.println(a[index]);
         }catch(ArrayIndexOutOfBoundsException ex){
             LOGGER.log(Level.SEVERE, "Exception occur", ex);
         }
        // turn scrambled off for backward compatibility
        choiceOffset = 0;
        choiceEfixed = true;  
    }
    
      
    /**
     * setup question choices and answer
     * 
     * @param  void
     */
     protected void setupQuestion() {
    	// This outputs constructor being run
    	 LOGGER.info("Info Print: "+LOGGER.getName());
    	 //ConsoleMethods.println("Question class setupQuestion method");
    	setupQuestionData();
        
    	// choice assignment
    	choices[aOffset] = choiceA;
    	choices[bOffset] = choiceB;
    	choices[cOffset] = choiceC;
    	choices[dOffset] = choiceD;
    	choices[eOffset] = choiceE;   	
    }
 
     /**
      * setup question data default, expectation is this will changed through polymorphism
      *
      * @param  void
      * @Override
      */
     
    protected void setupQuestionData() {
    	// This outputs constructor being run
    	LOGGER.info("Info Print: "+LOGGER.getName());
    	//ConsoleMethods.println("BobaQuestions class setupQuestionData method");
        
    	question = "What type of programming language is Java?";
		choiceA = "Data-oriented";
		choiceB = "Iterative";
		choiceC = "Object-oriented";
		choiceD = "Imperative";
		answer = choiceC;
		answerKey = charC;
    }
	
	/**
     * Question getter
     *
     * @param  void
     * @return String	contents of question
     */
	public String getQuestion() {
		return question;
	}
	
	/**
     * Choices getter for Multiple Choice
     *
     * @param  void
     * @return String 	content of choices with ABCDEF formatting
     */
	public String getChoices() {
		return String.format(
            charA + ": " + choices[0] + "\n"  + 
    	    charB + ": " + choices[1] + "\n"  + 
    	    charC + ": " + choices[2] + "\n"  + 
    	    charD + ": " + choices[3] + "\n"  + 
    	    charE + ": " + choices[4] + ""
            );    
	}
	
	public String getChoices(String group) {
		return String.format(
				charA + ": %s%n" +
				charB + ": %s%n" +
				charC + ": %s%n" +
				charD + ": %s%n" +
				charE + ": %s%n", choices[0], choices[1], choices[2], choices[3], choices[4]);
				
	}
	
	/**
     * Answer getter with formatting to correspond to getChoices
     *
     * @param  void
     * @return String 	correct answer with letter prefex of right answer (A or B or C...)
     */
	public String getAnswer() {	
		
		// This outputs randomization of letters
    	ConsoleMethods.println("Answer:" + answerKey);
		
		return answerKey + ": " + answer;
	}
    
	/**
     * Console support wrapper for asking question, getting result, and calculating results
     *
     * @param  void
     * @return void
     */
	
    protected void  askQuestionConsole()
    {
        // getAnswer return true if question is correct
        updateCounters ( getAnswerConsole() );
    }
    
    /**
     * Console support for asking question and getting result
     *
     * @param  void
     * @return void
     */
    private boolean getAnswerConsole()
    {
        char choice;
        
        // Implement this to randomize order
        ConsoleMethods.println(getQuestion());
        ConsoleMethods.println(getChoices());
        
        // IO logic of getting answer from console
        do {
            choice = ConsoleMethods.inputChar("Enter selection (A-E) --> ");
            choice = Character.toUpperCase(choice); // Convert to upper case
            if (choice >= charA && choice <= charE) break;
            ConsoleMethods.println(" (invalid) ");
        } while ( true );                                               // until valid input
        
        if (choice == answerKey) ConsoleMethods.print("(correct) ");
        else ConsoleMethods.print("(missed it!) ");
        ConsoleMethods.println(answer);
        ConsoleMethods.println();
        
        /*Boolean ansStatus = (choice == answerKey);
        calcResult(ansStatus)
        return ansStatus;*/
        return (choice == answerKey);
    }
  
}
