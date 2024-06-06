import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your max Value : ");
		int maxValue = scanner.nextInt();
		int x =1;
		int y = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(x < maxValue) {
			if (x != 1 ) {
				int z = x;
				x = y+x;
				y= z;
				list.add(x);
			}else {
				list.add(x);
				y++;
				list.add(y);
				x = x+y;
				list.add(x);
			}
			
		}
		System.out.println(list);
 
	}

}
