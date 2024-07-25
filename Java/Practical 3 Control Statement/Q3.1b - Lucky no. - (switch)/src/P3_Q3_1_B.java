import java.util.Scanner;

public class P3_Q3_1_B {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess the lucky number..");
		int guess = sc.nextInt();
		
		switch(guess)
		{
		case 0: System.out.println("Thank you");
		       break;
		case 33: System.out.println("Awesome! You are lucky!");
		       break;
		default: System.out.println("Thank you");
		}
		
		sc.close();
	}

}
