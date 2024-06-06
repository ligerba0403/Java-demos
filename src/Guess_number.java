
import java.util.Scanner;




public class Guess_number {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		
		int helpNumber = 100;
		int wrongCounter = 5 ;
		int hintCounter = 10;
		int random = (int) (Math.random() * 100 + 1 );
		
		
		
	
		
		while(wrongCounter > 0){
			System.out.println("I kept a number in mind. You can guess it or you can get hint. Do not forget  You have 3 guesses. 0-guess 1 - get hint");
			int choice = scanner.nextInt();
		
			switch (choice) {
			case 0:
				System.out.println("What is your guess ?");
				int answer = scanner.nextInt();
				
				if (answer == random) {
					System.out.println("Your answer is correct !!!");
					wrongCounter -= 5;
				}else {
					wrongCounter -= 1;
					System.out.println("Your answer is false. You have "+ wrongCounter + " tries");	
				}
				break;
			case 1:	
				if (hintCounter > 0) {
					System.out.println(GetHint(helpNumber/2 ,random));
					if (random < helpNumber/2) {
						helpNumber = helpNumber/2;
					}else {
						helpNumber = 3 * helpNumber/2;
					}
					hintCounter--;
					System.out.println(" You have "+ hintCounter + " hint");	
					break;
				
				}
				else {
					System.out.println("You don't have hint.");
				}
			default:
				System.out.println("Enter a valid number 1 or 0");
				break;
				
			}
		
		}
		
		
	}
	

	
	
	public static String GetHint(int x, int random) {
		String message = " ";
		
		if (random < x) {
			message = "This number is lower than " + x;
		}else {
			message = "This number is not lower than " + x;
		}
		return message;
		
	}

}

