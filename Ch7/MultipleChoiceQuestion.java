import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question{
		
		//defining constructor MultipleChoiceQuestion
		public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
			super(query);
			
			//calling the addChoice method
			addChoice("A",a);
			addChoice("B",b);
			addChoice("C",c);
			addChoice("D",d);
			addChoice("E",e);
			
			//calling the initQuestionDialog method from the parent class
			this.initQuestionDialog();
			
			// initialization of correctAnswer
			correctAnswer = answer; //.toUpperCase(); 
			
		} // end of constructor MultipleChoiceQuestion()
		
		
		//definition of addChoice method
		void addChoice(String name, String label) {
			//creating a choice  panel to arrange the button and the label
			JPanel choice = new JPanel(new BorderLayout());
			//creating a button with a given name
			JButton button = new JButton(name);
			//adding action listener to the button
			button.addActionListener(question);
			//adding the button to choice panel and aligning it to the left(WEST)
			choice.add(button,BorderLayout.WEST);
			//Adding the answer label to the center section of the panel
			choice.add(new JLabel(label + "    ",JLabel.LEFT), BorderLayout.CENTER);
			//adding the panel holding the button and answer label to the dialog box
			question.add(choice);
			
		}// end of addChoice method
				
		
				
}//end of class MultipleChoiceQuestion
