import java.awt.*;
import javax.swing.*;

public abstract class Question {

	     //initializing class variables
		static int nQuestions = 0;
		static int nCorrect = 0;
		//Initializing instance variables		
		QuestionDialog question;
		String correctAnswer;
		
		// defining Question constructor
		Question(String question){
			this.question = new QuestionDialog();
			//Giving question a grid layout with one column
			this.question.setLayout(new GridLayout (0,1));
			//Adding the question to JLabel
			this.question.add(new JLabel("    " + question + "    ",JLabel.CENTER ));
		}//End of Question constructor
		
		//definition of initQuestion method
		void initQuestionDialog() {
			//making the dialog box modal;
			this.question.setModal(true);
			//using pack method to resize the dialog box to fit the content
			this.question.pack();
			//centering the dialog box
			this.question.setLocationRelativeTo(null);
			
		}//end of initQuestion method
		
		//definition of the instance method ask that displays the quiz questions
		public  String ask() {
			question.setVisible(true);
			return question.answer; //returns the student answer
			
			}///end of ask method 
			
		//definition of instance method check
		public void check() {
			String answer = ask(); //calling ask with question parameter // answer is the value of userAnswer in ask method
			answer=answer.toUpperCase();
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
