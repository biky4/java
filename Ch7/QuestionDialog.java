
import javax.swing.JDialog;
import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener{

	//adding a string instance variable
	String answer;
	
	public void actionPerformed(ActionEvent e) {
		answer = e.getActionCommand();
		dispose();
		
	}//end of actionPerformed method
}
