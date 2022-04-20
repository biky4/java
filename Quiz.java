/***
 * 
 * This program asks the user a multiple choice question. The program displays the question until the user answers the question correctly.
 * If user replies a wrong answer the program displays either incorrect or invalid answer.
 * Author Btt : 20220420 : 6:23 PM
 * 
 * 
 */
import javax.swing.JOptionPane;
public class Quiz {

	public static void main(String[] args) {
		//Initializing question
		String question = "What is the smallest even and prime number?\n";
		question += "A) 10\n";
		question += "B) 3\n";
		question += "C) 4\n";
		question += "D) 2\n";
		question += "E) None of the above\n";
		String answer = ""; //user answer declaration and initialization
		String correctAnswer = "D";   // 2 is the smallest even and prime number
		
		while (true) {
			
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if(answer.equals(correctAnswer)) {
				JOptionPane.showMessageDialog(null, "Correct answer!");
				break;
				//return 
			}
			else if(answer.equals("A")||answer.equals("B")||answer.equals("C")|| answer.equals("E")) {
				JOptionPane.showMessageDialog(null, "Incorrect, please try again.");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid answer, please enter A,B,C,D or E.");
			}
		}
			
			
			
		
		}
		
		
		
	}

