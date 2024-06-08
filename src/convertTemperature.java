import java.util.Scanner;

public class convertTemperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter temperature : ");
		float temperature = scanner.nextFloat();
		
		System.out.println("What is your unit : 0-Celcius 1-Fahrenheit ");
		int choseUnit = scanner.nextInt();
		float convertFinal = 0;
		
		
		if (choseUnit == 0) {
			convertFinal = temperature * 1.8f + 32;
			System.out.println( temperature +" degree celcius is equal to " + convertFinal + " fahrenheit.");
			
		}else if (choseUnit == 1) {
			convertFinal = (temperature - 32) / 1.8f;
			System.out.println( temperature +" fahrenheit is equal to " + convertFinal + " degree celcius.");
		}else {
			System.out.println("Enter valid number, Run again.");
		}
		

	}

}
