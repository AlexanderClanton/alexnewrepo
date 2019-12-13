package AP_Exam;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.nio.file.*;

/**
 * encapsulation multiple choice
 *
 * @author (Ishita and Leah)
 * 
 */

public class encapsulationQuestions extends Question {

	int lineN = 0; 
	File qFile;
	
	/**
     * Constructor for objects of class encapsulationQuestions
     * 
     * @param  void
     * @return void
     */
	public encapsulationQuestions() {
		setupQuestion();
	} 
	

	/**
     * method to populate the question and answer variables for the specific question passed in
     * 
     * @param  string
     * @return void
     */
	@Override
	protected void setupQuestionData() {
		
		this.choiceE = "Does not exist right now";
		this.answer = "Look above for answer";
		
		Random rand = new Random();
		int r = rand.nextInt(3);
		
		String c = "";
		switch(r) { 
		
		case 0: //This is question 1 
			c = "@question1";
			//System.out.println("In Question 1");
			break; 
		case 1: 
			c = "@question2";
			//System.out.println("In Question 2");
			break; 
		case 2: 
			c = "@question3";
			//System.out.println("In Question 3");
			break; 
		
		}
		
		
		Path p5 = Paths.get(System.getProperty("user.dir"),"AP_Exam", "Encapsulation.txt");
		String path = p5.toString();
		qFile = new File(path);
		//System.out.println(qFile.exists());
		
		boolean a = qFile.exists();
		//System.out.print("Does the file exist" + a);
		try(BufferedReader br = new BufferedReader(new FileReader(qFile))) {
		 
		  
		  String st; 
		  String b; 
		  String f = "";
		  int a1 = 0; 
		  while ((st = br.readLine()) != null) 
		    if(st.equalsIgnoreCase(c)) {
		    	while(!f.equalsIgnoreCase("@end")) {
		    		//System.out.println("Found specific String: " + c);
		    	f = br.readLine();
		    	if(f.equalsIgnoreCase("@end"))
		    		break; 
		    	a1 = this.checkType(f);
		    	
		    	switch(a1) {
		    	case 1: 
		    		//question
		    		f= f.substring(10);
		    		this.question = f;
		    		
		    		break;
		    	case 2:
		    		//choiceA
		    		f= f.substring(9);
		    		this.choiceA = f;
		    		break;
		    	case 3:
		    		//choiceB
		    		f= f.substring(9);
		    		this.choiceB = f;
		    		break;
		    	case 4:
		    		//choiceC
		    		f= f.substring(9);
		    		this.choiceC = f;
		    		break;
		    	case 5:
		    		f= f.substring(9);
		    		this.choiceD = f;
		    		
		    		//choiceD
		    		break;
		    	case 6:
		    		//rightAnswer
		    		f= f.substring(13);
		    		char f1 = f.charAt(0);
		    		this.answerKey = f1; 
		    		break;
		    	default:
		    		//System.out.println("Reached default");
		    	}
		    	
		    	
		    	}
		    }
		  
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		   
		}
	
	private String searchKeyword(String a) {
		
		return null; 
	}
	
	 /**
     * method for reading text file in order to determine whether line is question or answer choice. If it is an answer choice, 
     * the choice letter is indicated.
     * @param  string
     * @return void
     */
	private int checkType(String i) {
		//System.out.println("Checking type");
		ArrayList<Character> al = new ArrayList<Character>();
		char c1; 
		
		for(int b1 = 0; b1 < i.length(); b1++) {
			c1 = i.charAt(b1);
			al.add(c1);
			
		}
		//System.out.println(al);
		if(al.get(0) == 'q')
		{
			return 1;
		} else if(al.get(6) == 'A') {
			return 2;
		} else if(al.get(6) == 'B') {
			return 3;
		}else if(al.get(6) == 'C') {
			return 4;
		}else if(al.get(6) == 'D') {
			return 5;
		}else if(al.get(0) == 'r') {
			return 6;
		}
		
		
		return 0;
		
		
	}
}

