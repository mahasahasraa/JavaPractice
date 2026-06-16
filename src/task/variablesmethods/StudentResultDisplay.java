package task.variablesmethods;

import java.util.Scanner;

public class StudentResultDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the English Marks: ");
		int english = sc.nextInt();
		
		System.out.print("Enter the Tamil Marks: ");
		int tamil = sc.nextInt();
	
		System.out.print("Enter the Maths Marks: ");
		int maths = sc.nextInt();
		
		int total = StudentResult.calculateTotal(english, tamil, maths);
		
		int avg = StudentResult.calculateAverage(total);
		
		char grade = StudentResult.calculateGrade(avg);
		
		boolean eligible = StudentResult.displayResult(grade);
		
		System.out.println("Student Name: " + name);
		System.out.println("Total Marks: "+total);
		System.out.println("Averge Marks: "+avg);
		System.out.println("Grade: "+grade);
		 
		if (eligible) {
			System.out.println("You are eligible for this course");
		} else {
			System.out.println("Sorry Better luck next time");
		}
		sc.close();
	}
}
