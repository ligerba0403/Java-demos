import java.util.Scanner;

public class factoriel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number which you want calculating factorial : ");
		int number = scanner.nextInt();
		
		int z = 1;
		
		for (int i = 1; i < number + 1; i++) {
			z = i * z;
		}
		
		System.out.println(z);
	}

}
