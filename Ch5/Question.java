import javax.swing.JOptionPane;

public abstract class Question {

	     //initializing class variables
		static int nQuestions = 0;
		static int nCorrect = 0;
		//Initializing instance variables		
		String question;
		String correctAnswer;
		
		//Adding an abstract declaration for the method ask
		abstract String ask();
			
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
			
	
}//end of abstract class Question
