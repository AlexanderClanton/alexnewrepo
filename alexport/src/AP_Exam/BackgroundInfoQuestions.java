package AP_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BackgroundInfoQuestions extends QuestionRandom {

	public BackgroundInfoQuestions() { // constructor calls methods to randomize questions and answers
		setupQuestionData();
		setupQuestion();
	}

	static private final String CHOICE_E = "None of the above"; // makes sure E is always the same and the last choice

	private void setChoicesAndAnswer(List<String> choices, int answerIndex) {
		this.answer = choices.get(answerIndex); // sets correct answer (String)
		choices = new ArrayList<String>(choices); // creates ArrayList out of List of choices passed as a parameter
		Collections.shuffle(choices); // Randomizes the answers
		this.choiceA = choices.get(0);
		this.choiceB = choices.get(1);
		this.choiceC = choices.get(2);
		this.choiceD = choices.get(3);
		this.choiceE = CHOICE_E; // choice E will always be the same regardless of parameter
		this.answerKey = (char) ('A' + new AnswerChoiceIndex().returnIndex(choices, this.answer)); // returns answer
																									// index as a
																									// character (A,B,C,
																									// or D)
	}

	public void setupQuestionData() {
		Random rand = new Random(); // creates randomizer for questions to use in switch case
		int randQ = rand.nextInt(5);// generates random numbers 0-4
		switch (randQ) {
		case 0:
			this.question = "What year was Java created?";// creates question
			setChoicesAndAnswer(Arrays.asList("1990", "2000", "1989", "1996"), 3); // sets randomized choices and
																					// correct answer
			break;
		case 1:
			this.question = "What type of programming language is Java?";
			setChoicesAndAnswer(Arrays.asList("Data-Oriented", "Iterative", "Object-oriented", "Imperative"), 2);
			break;
		case 2:
			this.question = "What is the name of the execution environment for Java?";
			setChoicesAndAnswer(Arrays.asList("Java Virtual Machine", "Java Bytecode Interpreter",
					"Java Bytecode Runner", "Java Program Executor"), 0);
			break;
		case 3:
			this.question = "What is a class in Java?";
			setChoicesAndAnswer(Arrays.asList("A place where students learn", "A function defined by the user",
					"A user-defined prototype from which objects are created",
					"A method that defines parameters for a function"), 2);
			break;

		case 4:
			this.question = "What is a package in Java?";
			setChoicesAndAnswer(Arrays.asList("A parcel shipped by the local mail office",
					"A collection of classes within a class", "A user-defined prototype where objects are created",
					"A collection of functions within a class"), 1);
			break;
		}
	}

}
