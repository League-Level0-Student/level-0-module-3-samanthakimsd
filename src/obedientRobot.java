import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	static Robot icee = new Robot();
public static void main(String[] args) {
String shape = JOptionPane.showInputDialog("Whic shape would you like to have drawn. Triangle, square, or circle?");
	icee.setSpeed(10);
	icee.penDown();
	if(shape.equals("triangle")) {drawTriangle();}
	if(shape.equals("square")) {drawSquare();}
	if(shape.equals("circle")) {drawCircle();}
}
	public static void drawSquare() {
	for (int i = 0; i <4; i++) {
	icee.move(200);
	icee.turn(90);
	}  }
public static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
icee.move(100);
icee.turn(120);
}}
public static void drawCircle() {
	for (int i = 0; i < 360; i++) {
		
	}
	icee.move(1);
	icee.turn(1);
}

}

