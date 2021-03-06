import java.util.Scanner;

/**
 * 
 */

/**
 * @author Cara Ip
 * October 3, 2016
 * APCS 1st period
 * 
 * Pair Programming Activity
 * 
 * Takes in String input and finds the smallest number, largest number,
 * largest even number, as well as the sum of all the even numbers.
 * 
 * 
 */
public class ProcessingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner user_input = new Scanner (System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int evenSum = 0;
		int evenMax = Integer.MIN_VALUE;
		System.out.println("How many numbers would you like to give?");
		int counter = user_input.nextInt();
		System.out.println("Enter your numbers.");
		for (int num = 0; num < counter; num++) {
			int nextNum = user_input.nextInt();
			if (nextNum % 2 == 0) {
				evenSum += nextNum;
				if (nextNum > evenMax){
					evenMax = nextNum;
				}
			}
			if (nextNum < min) {
				min = nextNum;
			}
			if (nextNum > max) {
				max = nextNum;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
		System.out.println("The largest even number is " + evenMax);
		System.out.println("The sum of all the even numbers is " + evenSum);
	}
}