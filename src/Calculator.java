

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter Second number : ");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Select action : 0-Addition 1-Subtraction 2-multiplication 3-Division ");
		int selectingAction = scanner.nextInt();
		
		float result = 0; 
		int resultControl = 0;
		
		switch (selectingAction) {
		case 0:	
			result = firstNumber + secondNumber;
			resultControl++;
			break;
		case 1:
			result = firstNumber - secondNumber;
			resultControl++;
			break;
		case 2:
			result = firstNumber * secondNumber;
			resultControl++;
			break;
		case 3:
			result = firstNumber / secondNumber;
			resultControl++;
			break;
		default:
			System.out.println("Enter a valid number for action");
			break;
		}
		
		if (resultControl != 0) {
			System.out.println("Result : " + result);
		}
		
		

	}

}

