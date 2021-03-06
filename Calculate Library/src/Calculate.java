// Cara Ip
// APCS 1st period
// September 24, 2016
// Math Library

import java.util.*;
public class Calculate {
	
	/* Square : This method returns the square of the value passed into it. 
	 * It accepts an integer and returns an integer.
	 */
	public static int square(int number) {
		return number * number;
	}
	/* Cube: This methods returns the cube of a value passed into it. 
	 * It accepts an integer and returns an integer.
	 */
	public static int cube(int number) {
		return number * number * number;		
	}
	/*Average (two values): This method returns the average of the two 
	 * values passed into it. It accepts two doubles and returns
	 * a double.
	 */
	public static double average(double num1, double num2) {
		return (num1 + num2 ) / 2;
	}
	/* Average (three values): This methods returns the average of the
	 * three values passed into it. It accepts three doubles and 
	 * returns three doubles.
	 */
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3 ) / 3;
	}
	/* toDegrees: This method converts radians to degrees, 
	 * with radians passed into it. It accepts a double and returns 
	 * a double.
	 */
	public static double toDegrees(double radians) {
		return ((radians * 180) / 3.14159);
	}
	/* toRadians: This method converts degrees to radians, with 
	 * degrees passed into it. It accepts a double and returns
	 * a double.
	 */
	public static double toRadians(double degrees) {
		return ((degrees * 3.14159) / 180);
	}
	/* Discriminant: This method finds the discriminant of the three values
	 * passed in. It accepts three doubles and returns a double.
	 */
	public static double discriminant (double a, double b, double c) {
		return ((b * b) - (4 * a * c));
	}
	/* toImproperFrac : This method converts a mixed number to an improper
	 * fraction. It accepts three integers and returns a String.
	 */

	public static String toImproperFrac(int wholenum, int mixednumerator, int denominator){
		int numerator = (wholenum * denominator) + mixednumerator;
		return (numerator + "/" + denominator);
	}
	/*  toMixedNum: This method converts an improper fraction to a mixed
	 * number. It accepts two integers and returns a String.
	 */
	
	public static String toMixedNum(int numerator, int denominator) {
		int wholenum = numerator / denominator;
		int remainder = numerator % denominator;
		if (remainder == 0) {
			return Integer.toString(wholenum);
		} else {
		return (wholenum + "_" + remainder + "/" + denominator);
		}
	}
		
	/*  Foil: This method performs the foil method. 
	 * It accepts four integers and a String and returns a String.
	 */
	public static String foil (int a, int b, int c, int d, String n) {
		String sign1;
		String sign2;
		int firstnum = (a*c);
		int secondnum = ((a *d) +(b*c));
		int thirdnum = (b*d);
		if (secondnum <= 0) {
			secondnum  *= (-1);
			sign1 = "–";
		} else {
			sign1 = "+";
		}
		if (thirdnum <= 0) {
			thirdnum  *= (-1);
			sign2 = "–";
		} else {
			sign2 = "+";
		}
		String answer = firstnum + n + "^2" + " " + sign1 + " " + secondnum + n + " " + sign2 + " " + thirdnum;	
		return answer;
	}
	/* isDivisibleBy: This method checks if a number is divisible by 
	 * another number. It accepts two integers and returns a boolean value.
	 */
	public static boolean isDivisibleBy(int dividend, int divisor) {
		if (divisor == 0) {
			throw new IllegalArgumentException("Dividing by zero is undefined. Enter a number that is not zero.");
		}
		if (dividend % divisor == 0) {
			return true;
		} else { 
			return false;
		}
	}
	/* absValue: This method performs the absolute value of a number.
	 * another number. It accepts two integers and returns a boolean value.
	 */
	public static double absValue (double number){
		if (number < 0) {
			return(Math.abs(number));
		} else {
			return number;
		}
	}
	/* Max: This method finds the larger of the two numbers.
	 * It accepts two integers and returns an integer.
	 */
	public static int max(int num1, int num2) {
		if (num1 < num2) {
			return num2;
		} else {
			return num1;
		}
	}
	/* Min: This method finds the smaller number of the two numbers.
	 * It accepts two integers and returns an integer.
	 */
	public static int min(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	/* Max3: This method finds the largest of the three numbers.
	 * It accepts three integers and returns an integer.
	 */
	public static double max(double num1, double num2, double num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 &&  num2> num3) {
			return num2;
		} else {
			return num3;
		}
	}
	/*Round 2: This method rounds a number to two decimal places. 
	 * It accepts a double and returns a double. 
	 */
	public static double round2(double num) {
		double movenum = num * 100;
		int intnum = (int)movenum;
		double diff = movenum - intnum;
		if (diff > 0.5) {
			intnum += 1;
			return (double)intnum / 100;
		} else {
			return (double)intnum / 100;
		}
	}
	/* Exponent: This method solves the exponent. 
	 * It accepts two integers and returns an integer. 
	 */
	public static double exponent(double base, int exponent) {
		if (exponent<0) {
	        throw new IllegalArgumentException("Please input a positive exponent");
	    }
		if (exponent == 0) {
			return 1;
		}
		double previous = base;
		while (exponent > 1) {
			previous = previous * base;
			exponent--;
		}
		return previous;
	}
			
	/* Factorial: This method returns the factorial of the number passed in.
	 * It accepts an integer and returns an integer.
	 */
	public static int factorial(int number){
		int total = 1;
		if (number < 0) {
			throw new IllegalArgumentException("Enter a number that is greater or equal to zero.");
		}
		while(number > 1){
			total =  total * number;
			number--;
		}
		return total;
	}
	/* isPrime: This method determines whether or not the number is prime
	 * It accepts an integer and returns a boolean value.
	 */
	public static boolean isPrime( int number) {
		for(int count = 2; count < number; count++){
			if (Calculate.isDivisibleBy(number, count) == true){
				return false;
			}
		}
		return true;
	}
	/* gcf: This method returns the greatest common factor. 
	 * It accepts two integers and returns an integer. 
	 */
	public static int gcf(int num1, int num2){
		int gcf = 1;
		for (int i = 1; i <= num1; i++ ) {
			if(isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
				gcf = i;
			}
		}
		return gcf;
	}
	/* squareRoot: This method determines the square root of the passed value.
	 * It accepts a double and returns a double.
	 */
	public static double sqrt(double square) {
		if (square < 0)
			throw new IllegalArgumentException("Cannot root negatives");
		double num;
		double squareRoot = square / 2;
		do {
			num = squareRoot;
			squareRoot = (num + (square / num)) / 2;
		} while ((num - squareRoot) != 0);
		return Calculate.round2(squareRoot);
	}
	/* quadForm: This method uses the coefficients of a quadratic equation and 
	 * finds approximates the real roots using the quadratic formula.
	 * It accepts three integers and returns a String. 
	 */
	public static String quadForm(int a, int b, int c){ 
		double root1;
		double root2;
		if(Calculate.discriminant(a, b, c) < 0){ 
			return "no real roots";
		} 
		else if(Calculate.discriminant(a, b, c) == 0) { 
			root1 = (double)(-b/(2*a));
			return "" + String.format("%.2f", root1);
		}
		else{
			root1 = Calculate.round2((double)(-b + Calculate.sqrt(Calculate.discriminant(a, b, c))) / 2*a);
			root2 = Calculate.round2((double)(-b - Calculate.sqrt(Calculate.discriminant(a, b, c))) / 2*a);
			if (root1>root2){
				return String.format("%.2f", root2) + " and " + String.format("%.2f", root1);
			}
			else{
				return String.format("%.2f", root1) + " and " + String.format("%.2f", root2);
			}
		}
		
}
	
}


