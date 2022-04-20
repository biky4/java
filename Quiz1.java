
import javax.swing.JOptionPane;
public class Quiz1{

	public static void main(String[] args) {
		//
		String question = "What is the smallest even and prime number?\n";
		question += "A) 10\n";
		question += "B) 3\n";
		question += "C) 4\n";
		question += "D) 2\n";
		question += "E) None of the above\n";
		String answer = JOptionPane.showInputDialog(question); //user answer
		answer = answer.toUpperCase();
		
		if(answer.equals("D")) {
			JOptionPane.showMessageDialog(null, "Correct answer!");
		}
		else if(answer.equals("A")||answer.equals("B")||answer.equals("C")|| answer.equals("E")) {
				JOptionPane.showMessageDialog(null, "Incorrect, please try again.");
				
			}
		else {
				JOptionPane.showMessageDialog(null, "Invalid answer, please enter A,B,C,D or E.");
			}
		
		}
		
		//String correctAnswer = "D";
		//while (answer != correctAnswer) {
			
		//}
		
	}

