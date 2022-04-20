


import javax.swing.JOptionPane;
public class do_while {

	public static void main(String[] args) {
		
		int sum=0;
	    String number;
		int count=11;
		do {
			number=JOptionPane.showInputDialog("Enter a number"); // String
			sum+=Integer.parseInt(number);//number particularly integer
			count+=1;		
		   }while(count<=10);
		String message= " The sum of the numbers you entered is " + sum;
		JOptionPane.showMessageDialog(null,message);
		

	}
}

