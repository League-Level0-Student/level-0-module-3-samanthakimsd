
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
	
			
		
		Robot icee = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
icee.setX(50);
		icee.setY(500);
		// 2. Make the robot draw a star shape. Hint: 144.
icee.setSpeed(20);
		icee.penDown();
icee.setRandomPenColor();
for (int i = 0; i < 5; i++) {
	icee.move(30);
icee.turn(144);}
icee.move(50);
		// 3. Set the size of the star to 30.
		
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
