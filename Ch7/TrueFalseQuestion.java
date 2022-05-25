
import javax.swing.*;
public class TrueFalseQuestion extends Question {
	
	
	//Adding TrueFalseQuestion constructor
	public TrueFalseQuestion(String question, String answer){
		super(question);
		//creating JPanel to organize the true false questions
		JPanel buttonsPanel = new JPanel();
		//adding true & false buttons by calling addButton method
		addButton(buttonsPanel,"True");
		addButton(buttonsPanel, "False");
		//adding the buttons panel to the dialog box
		this.question.add(buttonsPanel);
		//calling initQuestion method
		this.initQuestionDialog();
		//setting the instance variable correctAnswer to the (correct) teacher answer 
		this.correctAnswer = answer.toUpperCase();
	}// end of TrueFalseQuestion constructor
	
	//defining addButton method
	void addButton(JPanel buttonsPanel, String label) {
		JButton button = new JButton(label); // creating a new button with provided label
		button.addActionListener(question); //adding ActionListener
		buttonsPanel.add(button); //adding the button to the buttonPanel
	}//end of addButton method
	
	
	
}//end of TrueFalseQuestion class
