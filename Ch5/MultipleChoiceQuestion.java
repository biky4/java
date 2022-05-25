import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question{
		
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
		
		
		
		
		
		
		
		
		
}//end of class MultipleChoiceQuestion
