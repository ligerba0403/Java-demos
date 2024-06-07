import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class GradeAvarageCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of your lessons : ");
		int numberLessons = scanner.nextInt();
		
		float[] grades = new float[numberLessons];
		float[] lessonHours = new float[numberLessons];
		float[] totalAvarages = new float[numberLessons];
		
		for (int i = 0; i < numberLessons; i++) {
			System.out.println("This is your "+ i +"th lesson");
			System.out.println("Enter First exam score : ");
			int firstExam = scanner.nextInt();
			System.out.println("Enter Second exam score : ");
			int secondExam = scanner.nextInt();
			System.out.println("Enter teacher evaluation score : ");
			int teacherScore = scanner.nextInt();
			System.out.println("Enter weekly lesson time : ");
			int lessonHour = scanner.nextInt();
			
			lessonHours[i] = lessonHour;
			float scoreAvarage = (firstExam + secondExam + teacherScore)  / 3;
			grades[i] = scoreAvarage;
			totalAvarages[i] = scoreAvarage * lessonHours[i];
			
			
		}
		
		float totalScore = 0;
		float totalHours = 0;
		
		for (int i = 0; i < totalAvarages.length; i++) {
			totalScore =+ totalAvarages[i];
			totalHours =+ lessonHours[i];
		}
		
		float finalScore = totalScore / totalHours;
		System.out.println(finalScore);
				
	}
	
}
