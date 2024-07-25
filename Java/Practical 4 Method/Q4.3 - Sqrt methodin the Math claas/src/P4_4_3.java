import java.util.Scanner;

public class P4_4_3 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a value you: ");
		Scanner sc = new Scanner(System.in);
		
		double value = sc.nextDouble();
		
		// get the square root of a value
		double sqrtValue = Math.sqrt(value);
		
		System.out.println("square root of " + value+" = "+ sqrtValue);

	}

}
