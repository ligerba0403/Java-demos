
import java.util.Scanner;

public class Word_counter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int spaceCounter = 0 ;
		
		System.out.println("Please enter sencente: ");
		String sentence = scanner.nextLine();
		
	for (int i = 0; i < sentence.length(); i++) {
		if (sentence.charAt(i) == ' ') {
			spaceCounter++;
		}
	}
	
	spaceCounter += 1 ;
	System.out.println("Your sentence has " + spaceCounter + " word.");
		

	}

}

