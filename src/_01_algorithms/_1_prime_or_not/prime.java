package _01_algorithms._1_prime_or_not;
import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {
		
		
		String n = JOptionPane.showInputDialog("Hello, enter a number");
		
		int n1 = Integer.parseInt(n);
		
		if(n1 % 2 == 0){
			JOptionPane.showMessageDialog(null, "The nummber is even");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "The number is prime");
		}
		

		
	}
}
