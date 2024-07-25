import java.util.Scanner;

public class P3_Q3_1_A {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int lucky = 33;
		
		System.out.println("Guess the lucky number..");
		
		int guess = sc.nextInt();
		
		if(guess == lucky) {
			System.out.println("Congrats you're awesome, you are lucky! ");
		}
		else {
			System.out.println("Thank You");
		}
		
		
	}
	

}

