//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String b = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
			if(b.equals("no")) {
				JOptionPane.showMessageDialog(null, "you are crazy!");
			}
		//3. if they say yes
			if(b.equals("yes")) {
				String h = JOptionPane.showInputDialog("What's your favorite hobby?");
						 JOptionPane.showInputDialog(h + "is much better with bananas!");
			}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
