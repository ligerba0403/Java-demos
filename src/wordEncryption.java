import java.util.Iterator;
import java.util.Scanner;

public class wordEncryption {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	char[] alphabets = {'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'};
	int keyNum = 0;
	
	System.out.println("Select action : 0-encryption  1-decoding ");
	int selection = scanner.nextInt();
	
	if (selection == 0) {
		
		System.out.println("Enter keyNum :  ");
		 keyNum = scanner.nextInt();

		System.out.println("Enter your word (Dont use space): ");
		String input = scanner.next();
		
		
		
		
		char[] characters = input.toCharArray();
		
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (alphabets[j] == characters[i]) {
                    
                	
                    int z = (j + keyNum) % alphabets.length;
                    
                    characters[i] = alphabets[z];
                    
                    break; 
                }
            }
        }
        String finalWord = new String(characters);
		System.out.println("your encrypted word : " + finalWord);
			
		}
		
	else if (selection == 1) {
		
		System.out.println("Enter keyNum :  ");
		 keyNum = scanner.nextInt();

		System.out.println("Enter your word (Dont use space): ");
		String input = scanner.next();
		
		
		
		
		char[] characters = input.toCharArray();
		
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (alphabets[j] == characters[i]) {
                   
                    int z = ((j - keyNum) % alphabets.length + alphabets.length) % alphabets.length;
               
                    characters[i] = alphabets[z];
                    break; 
                }
            }
        }
        
       String finalWord = new String(characters);
		System.out.println("your decoding word : " + finalWord);
		
	}else {
		
		System.out.println("Enter valid number!!");
	}
	
	

	}

}
