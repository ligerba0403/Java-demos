import java.util.Scanner;

public class wordInventer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter word which is you want to reverse : ");
		String word = scanner.next();
		
		char[] charWord = word.toCharArray();
		char[] newCharWord = new char[charWord.length];
		
		for (int i = 0; i < charWord.length; i++) {
			
			int z = charWord.length - 1 - i;
			
			newCharWord[i] = charWord[z];
		}
			
		String reverseString = new String(newCharWord);
		System.out.println( word +"  " +reverseString);
	}

}
