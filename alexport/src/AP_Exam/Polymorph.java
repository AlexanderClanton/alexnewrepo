package AP_Exam;
import java.util.Random;

/*
 * author Rhea, Mateo
 */

public class Polymorph extends Question {
        public Polymorph()
        {
        	super.setupQuestion();
        }
        
        public static String mainTest ()
        {
	    	Question q = new Polymorph();
	        q.askQuestionConsole();
	        return q.getCounterMsg();
        }

    @Override
    protected void setupQuestionData()
    {  
    	Random rand = new Random();
        int test = rand.nextInt(5); 
        // format question
        if (test == 0) {
        this.question = "Which method implies calling a method within itself?";        
	        this.choiceA = "for loop";
	        this.choiceB = "polymorphism";
	        this.choiceC = "type casting"; 
	        this.choiceD = "recursion";
	        this.choiceE = "None of the above";
	        answer = this.choiceD;
	        answerKey = this.charD;

        }
        else if (test ==1) {
        	this.question = "Which datatype is the best to use when you want to incorporate decimals?";
            this.choiceA = "int";
            this.choiceB = "boolean";
            this.choiceC = "double"; 
            this.choiceD = "All of the above";
            this.choiceE = "None of the above";
            answer = this.choiceC; 
	        answerKey = this.charC;

        }
        else if (test ==2) {
        	this.question = "When you want the first value of an array called Pets, how do you write that?";
            this.choiceA = "Pets[0]";
            this.choiceB = "Pets[1]";
            this.choiceC = "Pets.first[]"; 
            this.choiceD = "All of the above";
            this.choiceE = "None of the above";
            answer = this.choiceA;
	        answerKey = this.charA;

        }
        else if (test ==3) {
        	this.question = "What is true about method overloading?";
            this.choiceA = "Different method names, same parameters";
            this.choiceB = "Same method names, same parameters";
            this.choiceC = "Different method names, different parameters"; 
            this.choiceD = "Same method names, different parameters";
            this.choiceE = "None of the above";
            answer = this.choiceD;
	        answerKey = this.charD;

            
        }
        else if (test ==4) {
        	this.question = "What would the str.indexOf(7) be if str = 'AP Computer Science'?";
            this.choiceA = "P";
            this.choiceB = "u";
            this.choiceC = "Science"; 
            this.choiceD = "uter Science";
            this.choiceE = "Computer";
            answer = this.choiceD;
            answerKey = this.charD;

        }
        
        else if (test == 5 || test == 6) {
        	this.question = "Which of the following is the correct way to remove the value " + test + " from the list below? \n nums = [5,6,7,8,9,10]";
            this.choiceA = "nums.remove(5);";
            this.choiceB = "nums.remove(0);";
            this.choiceC = "nums.remove(1);"; 
            this.choiceD = "nums.remove(2);";
            this.choiceE = "None of the above";
            answer = this.choiceE;
	        answerKey = this.charE;

       
        }
    }
}