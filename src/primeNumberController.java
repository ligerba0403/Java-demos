
import java.util.Scanner;

public class primeNumberController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		
		int controller = 0; 
		for (int i = num - 1; i < num && i > 1; i--) {
			if (num%i == 0) {
				controller ++;
				
			}
			
		}
		
		if (controller == 0) {
			System.out.println("This number is  prime number.");
		}else {
			System.out.println("This number is  not prime number.");
		}
		
	
		
	}

}
