package task.controlstatements;

import java.util.Scanner;

public class CollegeAdmission {
	static String collegeName = "ABC Engineering College";
	String studentName;
	int age;
	float cutoff;
	static String course;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		CollegeAdmission obj = new CollegeAdmission();
		
		System.out.print("Enter your Name: ");
		obj.studentName = sc.nextLine();
		
		System.out.print("Enter your age: ");
		obj.age = sc.nextInt();
		
		if(obj.age >= 18) {
			System.out.println("Age Criteria Satisfied");
			
			System.out.print("Enter your Cutoff: ");
			obj.cutoff = sc.nextFloat();
			
			if(obj.cutoff > 170) {
				System.out.println("Cut Score is eligible for admission");
				System.out.println(" ");
				
				System.out.println("***************************");
				System.out.println("List of Courses available");
				System.out.println("***************************");
				System.out.println("1. Computer Science");
				System.out.println("2. AIDS");
				System.out.println("3. AIML");
				System.out.println("4. CSBS");
				System.out.println("5. CyberSecurity");
				System.out.print("Please select your course (1 to 5): ");
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					course = "Computer Science";
					break;
				case 2:
					course = "AIDS";
					break;
				case 3:
					course = "AIML";
					break;
				case 4:
					course = "CSBS";
					break;
				case 5:
					course = "Cyber Security";
					break;
				default:
					System.out.println("Please select courses only from the above list");
				}
				
				if(course != null) {
				System.out.println("Congratulations " + obj.studentName+ " You have selected "+course + " course in "+ collegeName );
				}	
							
			}else {
				System.out.println("Cut Score is not eligible for admission. Please try next time");
			}
		}
		else {
			System.out.println("Age criteria is not met ");
		}
		
		sc.close();

	}
}
