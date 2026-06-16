package task.loops;

import java.util.Scanner;

public class LoopsPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		// FOR LOOP
		System.out.println("\nNumbers from 1 to " + n);

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

		// WHILE LOOP
		int i = 1;
		int sum = 0;

		while (i <= n) {
			sum += i;
			i++;
		}

		System.out.println("\nSum of numbers from 1 to " + n + " = " + sum);

		// DO-WHILE LOOP
		int choice;

		do {

			System.out.println("\n===== MENU =====");
			System.out.println("1. Even Numbers Count");
			System.out.println("2. Odd Numbers Count");
			System.out.println("3. Multiplication");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			if (choice == 1) {

				int evenCount = 0;

				for (i = 1; i <= n; i++) {
					if (i % 2 == 0) {
						evenCount++;
					}
				}

				System.out.println("Even Count = " + evenCount);

			} else if (choice == 2) {

				int oddCount = 0;

				for (i = 1; i <= n; i++) {
					if (i % 2 != 0) {
						oddCount++;
					}
				}

				System.out.println("Odd Count = " + oddCount);

			}else if (choice == 3) {
				
				for (i = 1; i <= 10; i++) {
					System.out.println(n + " X " + i + " = " + (n * i));
				}
				
			} else if (choice == 4) {

				System.out.println("Thank you!");

			} else {

				System.out.println("Invalid Choice");

			}

		} while (choice != 4);

		sc.close();
	}
}