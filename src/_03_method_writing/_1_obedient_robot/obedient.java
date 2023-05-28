package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obedient {
	public static void main(String[] args) {
	
		
		drawTriangle(500);
	
	
	
	}
	
	public static void drawSquare(int dist) {
		Robot rob = new Robot();
		
		rob.penDown();
		rob.setSpeed(300);
		
		rob.move(dist);
		rob.turn(90);
		rob.move(dist);
		rob.turn(90);
		rob.move(dist);
		rob.turn(90);
		rob.move(dist);
		rob.turn(90);
	}
	
	public static void drawTriangle(int dist) {
		Robot rob = new Robot();
		
		rob.penDown();
		rob.setSpeed(300);
		
		rob.turn(45);
		rob.move(dist);
		rob.turn(135);
		rob.move(dist);
		rob.turn(115);
		rob.move(dist);
		
	}
}
