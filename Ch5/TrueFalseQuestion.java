import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question {
	
	//Adding TrueFalseQuestion constructor
	public TrueFalseQuestion(String question, String answer){
		this.question = "True or False: " + question;
		//setting the instance variable correctAnswer to the (correct) teacher answer 
		correctAnswer = answer.toUpperCase();
	}

	//definition of the instance method ask that displays the quiz questions
			public  String ask() {
				String userAnswer="";
				while (true){
					userAnswer = JOptionPane.showInputDialog(question);
					//converting userAnswer to upper case before checking their validity
					userAnswer = userAnswer.toUpperCase();
					if(userAnswer.equals("F")||userAnswer.equals("FALSE")||
					   userAnswer.equals("N")|| userAnswer.equals("NO")
					   ){
						return "FALSE";
					}// end of if block
					else if (   
					   userAnswer.equals("T")|| userAnswer.equals("TRUE")||
					   userAnswer.equals("Y")|| userAnswer.equals("YES")
					) {
						return "TRUE";
					}//end of else if block
					else {
						JOptionPane.showMessageDialog(null, "Invalid answer, please enter TRUE or FALSE.");
					}// end of else block
					
					
				}//end of while loop
				
			}///end of ask method 
	
	
	
	
	
}//end of TrueFalseQuestion class
