import java.util.Scanner;

public class NumberComparator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first number : ");
		int firsNum = scanner.nextInt();
		
		System.out.println("Enter your Second  number : ");
		int secondNum = scanner.nextInt();
		
		
		if (firsNum > secondNum) {
			System.out.println(firsNum + " is bigger than " + secondNum);
		}else if (secondNum > firsNum) {
			System.out.println(secondNum + " is bigger than " + firsNum);
		}else if (firsNum == secondNum) {
			System.out.println(firsNum + " is equal to " + secondNum);
		}else {
			System.out.println("ERROR");
		}

	}

}
