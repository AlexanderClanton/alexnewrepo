package AP_Exam;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * 
 * This class returns the Array index and the char of the correct answer choice for OperatorQuestions.
 * @author Daniel and Fox
 * @see AnswerChoiceIndex
 */
public class AnswerChoiceIndex {
	public int returnIndex(List<String> arr, String correctAns) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).contentEquals(correctAns)) {
				return i;
			}
		}
		return -1;
	}
	
	public char returnAns(int Index) {
		if (Index == 0) {
			return 'A';
		}
		if (Index == 1) {
			return 'B';
		}
		if (Index == 2) {
			return 'C';
		}
		if (Index == 3) {
			return 'D';
		}
		if (Index == 4) {
			return 'E';
		}
		return 'F';
	}
}