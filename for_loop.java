
import javax.swing.JOptionPane;
public class for_loop {

	public static void main(String[] args) {
		
		int sum=0;
	    String number;
		for (int count=1;count<=10;count++) {
			number=JOptionPane.showInputDialog("Enter a number"); // String
			sum+=Integer.parseInt(number);//number particularly integer
			//count+=1; // already included in the for loop condition
			
		}
		String message= " The sum of the numbers you entered is " + sum;
		JOptionPane.showMessageDialog(null,message);
}
}

