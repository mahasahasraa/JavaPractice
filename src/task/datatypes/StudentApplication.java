package task.datatypes;

public class StudentApplication {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.studentId = 123;
		stu.studentName = "Maha";
		stu.age = 20;
		stu.grade = 'A';
		stu.admissionEligible = true;
		stu.english = 99;
		stu.tamil = 98;
		stu.maths = 100;
		stu.fees = 10998.99f;
		stu.mobnumber = 9994064755L;
		
		
		System.out.println("*****************************");
		System.out.println("-----Student Details-----");
		System.out.println("*****************************");
		System.out.println("Student ID = "+ stu.studentId);
		System.out.println("Student Name = "+ stu.studentName);
		System.out.println("Student Age = "+ stu.age);
		System.out.println("Student Mobile Number = "+ stu.mobnumber);
		System.out.println("Student English Marks = "+ stu.english);
		System.out.println("Student Tamil Marks = "+ stu.tamil);
		System.out.println("Student Maths Marks = "+ stu.maths);
		System.out.println("Student Admission Eligible = "+ stu.admissionEligible);
		System.out.println("Student Grade = "+ stu.grade);
		System.out.println("Student Fees = "+ stu.fees);
	
	}

}
