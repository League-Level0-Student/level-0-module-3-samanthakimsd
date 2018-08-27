import javax.swing.JOptionPane;

public class areYouHappy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("are you happy?");
	if(happy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing what you are doing!");}
		else{String unhappy = JOptionPane.showInputDialog("do you wnat to be happy?");
		if(unhappy.equals("yes")) {
			
		JOptionPane.showMessageDialog(null, "try something diffrent");
		}
		else{JOptionPane.showMessageDialog(null, "keep doing what you are doing!");}}
	}
{}
}
