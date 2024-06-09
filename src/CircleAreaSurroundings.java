import java.util.Scanner;

public class CircleAreaSurroundings {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final float pi = 3.141592653589793238462643383279502884197f;
		
		System.out.println("Enter your flat's radius : ");
		int radius = scanner.nextInt();
		
		float circleArea = pi * radius * radius;
		float circleSurrounding =  pi * 2 * radius;
		
		System.out.println("Your circle  area is : " + circleArea);
		System.out.println("Your circle  surroundings is : " + circleSurrounding);

	}

}
