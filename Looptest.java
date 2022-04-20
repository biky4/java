


import javax.swing.JOptionPane;
public class Looptest {

	public static void main(String[] args) {
		
		int sum=0;
	    String number;
		int count=1;
		while(count<=4) {
			number=JOptionPane.showInputDialog("Enter a number"); // String
			sum+=Integer.parseInt(number);//number particularly integer
			count+=1;
	

	      }// end of while loop.------- loops 10 times
		String message= " The sum of the numbers you entered is " + sum;
		JOptionPane.showMessageDialog(null,message);
		
		
	}
}

