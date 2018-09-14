/*
 * Michael Maddalon, D Block
 */

import java.awt.Rectangle;

public class Homework1 {

	/* Fix the error(s) in this method so that it runs properly
	 */
	public static int problem1() {
		int mystery = 2;
		mystery = mystery + 1;
		mystery = (1 - 2) * mystery;
		return mystery;
	}


	/* Construct and return a Rectangle that has a width of w and a
	 * height of h
	 */

	public static Rectangle problem2(int w, int h) {

		Rectangle r = new Rectangle(0, 0, w, h);
		return r;


	}

	/* Declare an integer, assign it a value of 5, then return it
	 */
	public static int problem3() {

		int prob3 = 5;
		return prob3;

	}

	/* Declare and return a String containing the phrase "Computer Science"
	 */
	public static String problem4() {

		String str = new String("Computer Science");
		return str;


	}

	/* Add 5 to num and return the new value
	 */
	public static int problem5(int num) {
		num = num + 5;
		return num;

	}

}
