package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		int k = 50;
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setY(550);
			robots[i].setX(k);
			k += 199;
		}
		// 5. use another for loop to iterate through the array and make each robot move
		boolean finish = false;
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while (finish == false) { // a random amount less than 50.
			for (int i = 0; i < robots.length; i++) {
				Random random = new Random();

				robots[i].move(random.nextInt(50));
				if (robots[i].getY() < 0) {
					finish = true;
					// 7. declare that robot the winner and throw it a party!
					JOptionPane.showMessageDialog(null, "We have a sausage. *Party noises and awkward kazoo guy standing in a bathtub at home*");
					break;
				}
			}
		}
	}

	// 8. try different races with different amounts of robots.
	
	//NO!
	
	// 9. make the robots race around a circular track.
	
}
