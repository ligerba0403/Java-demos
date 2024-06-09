import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class BasicTextEditor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text : ");
		String wordString = scanner.next();
		
		System.out.print("Select action 0- upperCase 1- lowerCase : ");
		int selection = scanner.nextInt();
		
		if (selection == 0) {
			System.out.println(wordString.toUpperCase());
		}
		else if (selection == 1) {
			
			System.out.println(wordString.toLowerCase());
		}
		else {
			System.out.println("Enter valid number ! ");
		}
				
	}

}
