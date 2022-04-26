
import javax.swing.JOptionPane;
public class Quiz_ch3 {
	
	//adding static member variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
    
	public static void main(String[] args) {
		//Initializing question
		String question = "1. What is the smallest even and prime number?\n";
		question += "A) 10\n";
		question += "B) 3\n";
		question += "C) 4\n";
		question += "D) 2\n";
		question += "E) None of the above\n";
		String correctAnswer = "D";   // 2 is the smallest even and prime number
		//String userReply=ask(question); // userReply is user answer //calling ask
		check(question,correctAnswer);	//calling check method using two arguments in main method
		
		//Second question
		question = "2. What is the largest sized animal among the following?\n"; 
		question += "A) Ant\n";
		question += "B) Elephant\n";
		question += "C) Dog\n";
		question += "D) Cat\n";
		question += "E) Butterfly\n";
		correctAnswer = "B";
		check(question,correctAnswer); //calling check method using two arguments in main method
		
		//Third question
		question = "3. Which continent is the smallest?\n";
		question += "A) Asia\n";
		question += "B) Africa\n";
		question += "C) North America\n";
		question += "D) Europe\n";
		question += "E) Australia\n";
		correctAnswer = "E";
		check(question,correctAnswer); //calling check method using two arguments in main method
		
		//main method displaying the number of questions and the number of correct answers
		JOptionPane.showMessageDialog(null,nCorrect + " correct out of " + nQuestions + " questions");
			
		
		}// end of main 
	
	
	//definition of check method
	public static void check(String question, String correctAnswer) {
		String answer = ask(question); //calling ask with question parameter // answer is the value of userAnswer in ask method
		nQuestions +=1; //updating static member variable nQuestions by one
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect += 1; //updating static member variable nCorrect by one
			
		}//end of if block
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
		}//end of else block
		
	}//end of check method
	
	//definition of the ask method
	public static String ask(String question) {
		String userAnswer="";
		while (true){
			userAnswer = JOptionPane.showInputDialog(question);
			userAnswer = userAnswer.toUpperCase();
			if(userAnswer.equals("A")||userAnswer.equals("B")||userAnswer.equals("C")|| userAnswer.equals("D") ||userAnswer.equals("E")) {
				return userAnswer;
			}//end of if block
			else {
				JOptionPane.showMessageDialog(null, "Invalid answer, please enter A,B,C,D or E.");
			}// end of else block
			
			
		}//end of while loop
		
	}///end of ask method 
	
		
		
		
	}//end of public class Quiz

