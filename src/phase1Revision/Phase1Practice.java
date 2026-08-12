package phase1Revision;

import java.util.*;

public class Phase1Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ==========================================================
		// 1. Write a program to swap two numbers without using a
		//    third variable (use arithmetic or XOR).
		// ==========================================================
		int a = 13;
		int b = 5;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("1. Swap using arithmetic -> a=" + a + " b=" + b);

		int a1 = 10;
		int b1 = 15;
		a1 = a1 ^ b1;
		b1 = a1 ^ b1;
		a1 = a1 ^ b1;
		System.out.println(" Swap using XOR -> a1=" + a1 + " b1=" + b1);


		// ==========================================================
		// 2. Write a program to check if a number is prime.
		// ==========================================================
		int primeNum = 17;
		boolean isPrime = true;

		if (primeNum <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= primeNum / 2; i++) {
				if (primeNum % i == 0) {
					isPrime = false;
					break; // no need to check further once a divisor is found
				}
			}
		}
		System.out.println("2. " + primeNum + " is prime? " + isPrime);


		// ==========================================================
		// 3. Write a program to print the Fibonacci series up to
		//    N terms using a loop.
		// ==========================================================
		int n = 5;
		int num1 = 0, num2 = 1;
		System.out.print("3. Fibonacci series: " + num1 + " " + num2);

		for (int i = 2; i < n; i++) {
			int num = num1 + num2;
			System.out.print(" " + num);
			num1 = num2; // shift forward for next iteration
			num2 = num;  // shift forward for next iteration
		}
		System.out.println();


		// ==========================================================
		// 4. Write a program to check if a given year is a leap
		//    year (use logical operators).
		// ==========================================================
		System.out.print("4. Enter the year: ");
		int year = sc.nextInt();

		// Rule: divisible by 4 AND not by 100, UNLESS also divisible by 400
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println(year + " is leap year ?" + isLeap);


		// ==========================================================
		// 5. Write a program that takes a number and prints whether
		//    it's positive, negative, or zero using a ternary operator.
		// ==========================================================
		System.out.print("5. Enter the number: ");
		int number = sc.nextInt();

		String result = (number == 0) ? "Zero" : (number > 0) ? "Positive" : "Negative";
		System.out.println("Result: " + result);


		// ==========================================================
		// 6. Write a program to reverse a number (e.g., 1234 -> 4321)
		//    using % and /.
		// ==========================================================
		int numbers = 1234;
		int reversed = 0;
		int temp = numbers; // preserve original for printing later

		while (temp != 0) {
			int lastDigit = temp % 10;           // extract last digit
			reversed = reversed * 10 + lastDigit; // shift reversed left, add digit
			temp = temp / 10;                     // remove last digit from original
		}
		System.out.println("6. Reversed number of " + numbers + " -> " + reversed);


		// ==========================================================
		// 7. Write a program using nested loops to print this pattern:
		//    1
		//    1 2
		//    1 2 3
		//    1 2 3 4
		//    1 2 3 4 5
		// ==========================================================
		System.out.println("7. Pattern:");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}


		// ==========================================================
		// 8. Write a program using enhanced switch to convert a
		//    number (1-7) into its corresponding day name.
		// ==========================================================
		System.out.print("8. Enter the day (1-7): ");
		int day = sc.nextInt();

		String dayName = switch (day) {
			case 1 -> "Sunday";
			case 2 -> "Monday";
			case 3 -> "Tuesday";
			case 4 -> "Wednesday";
			case 5 -> "Thursday";
			case 6 -> "Friday";
			case 7 -> "Saturday";
			default -> "Invalid day";
		};
		System.out.println("The day is " + dayName);


		// ==========================================================
		// 9. Write a program to find the sum of digits of a number
		//    (e.g., 1234 -> 1+2+3+4 = 10).
		// ==========================================================
		int num9 = 1234;
		int sum = 0;
		int temp9 = num9; // preserve original for printing later

		while (temp9 != 0) {
			int digit = temp9 % 10;
			sum = sum + digit;
			temp9 = temp9 / 10;
		}
		System.out.println("9. Sum of digits of " + num9 + " -> " + sum);


		// ==========================================================
		// 10. Predict the output (trace manually before running):
		//     int a = 5;
		//     int b = a++ + ++a - a--;
		// ==========================================================
		int ab = 5;
		int bc = ab++ + ++ab - ab--;
		// Trace: ab++ returns 5 (ab->6), ++ab makes ab=7 returns 7,
		// ab-- returns 7 (ab->6)  =>  bc = 5 + 7 - 7 = 5, final ab = 6
		System.out.println("10. ab=" + ab + " bc=" + bc);


		sc.close();
	}
}