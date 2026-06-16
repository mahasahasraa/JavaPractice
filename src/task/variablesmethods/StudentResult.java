package task.variablesmethods;

public class StudentResult {

	static String SchoolName = "ABC School";
	
	
	public static int calculateTotal(int eng, int tamil, int maths) {
		return eng+tamil+maths;
	}
	
	
	public static int calculateAverage(int total) {
		return total/3;
	}
	
	public static char calculateGrade(int average) {
		if(average > 90 && average <= 100) {
			return 'A';
		} else if (average > 80 && average <=90) {
			return 'B';
		} else {
			return 'C';
		}
		
	}
	public static boolean displayResult(char grade) {
		if (grade == 'A' || grade == 'B') {
			return true;
		}else {
			return false;
		}
	}

}
