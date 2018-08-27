
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 23";
		String dadsBirthday = "September 17th";
		String myBirthday = "January 31th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog("who's birthday do you want to hear?");
		// 3. Print out what the user typed
	System.out.println(bday);
		// 4. if user asked for "mom"
			//print mom's birthday
	if(bday.equals("mom")) {JOptionPane.showMessageDialog(null, momsBirthday);}
		// 5. if user asked for "dad"
			// print dad's birthday
	if(bday.equals("dad")) {JOptionPane.showMessageDialog(null, dadsBirthday);}
		// 6. if user asked for your name
			if(bday.equals("sami")){JOptionPane.showMessageDialog(null, myBirthday);
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			{JOptionPane.showMessageDialog(null, "i dont remember that birthday");}

	} 
}}
