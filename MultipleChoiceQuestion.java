import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {

		//initializing class variables
		static int nQuestions = 0;
		static int nCorrect = 0;
		//Initializing instance variables		
		String question;
		String correctAnswer;
		
		//defining constructor MultipleChoiceQuestion
		public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
			
			question = query +"\n";
			question += "A. " + a + "\n";
			question += "B. " + b + "\n";
			question += "C. " + c + "\n";
			question += "D. " + d + "\n";
			question += "E. " + e + "\n";
			
			correctAnswer = answer.toUpperCase(); // initialization of correctAnswer
			
		} // end of constructor MultipleChoiceQuestion()
		
		
		//definition of the instance method ask that displays the quiz questions
		public  String ask() {
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
		
		
		//definition of instance method check
		public void check() {
			String answer = ask(); //calling ask with question parameter // answer is the value of userAnswer in ask method
			nQuestions +=1; //updating static member variable nQuestions by one
			if (answer.equals(correctAnswer)) {
				JOptionPane.showMessageDialog(null, "Correct!");
				nCorrect += 1; //updating static member variable nCorrect by one
				
			}//end of if block
			else {
				JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
			}//end of else block
			
		}//end of check method
		
		
		//definition of showResults method
		public static void showResults() {
			
			//main method displaying the number of questions and the number of correct answers
			JOptionPane.showMessageDialog(null,nCorrect + " correct out of " + nQuestions + " questions");
			
		}// end of showResults method
		
		
}//end of class MultipleChoiceQuestion
