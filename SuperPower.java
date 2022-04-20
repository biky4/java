import javax.swing.JOptionPane;
public class SuperPower {
	public static void main(String[] args)
	{
		//System.out.println("SUPER POWERS TO THE RESCUE!");
		//JOptionPane.showMessageDialog(null, "SUPER POWERS TO THE RESCUE!");
		String power = JOptionPane.showInputDialog("What is your Super power?");
		power =power.toUpperCase();
		JOptionPane.showMessageDialog(null, power + " TO THE RESCUE!");
		
	}
}
