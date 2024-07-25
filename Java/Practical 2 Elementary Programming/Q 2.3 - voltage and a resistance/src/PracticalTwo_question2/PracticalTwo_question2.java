package PracticalTwo_question2;

import java.util.Scanner;

public class PracticalTwo_question2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the voltage");
		double vol = sc.nextDouble();
		System.out.println("Enter the resistance");
		double res = sc.nextDouble();
		
		double curr = vol/res;
		System.out.println("The current is: " + curr);
		
		
		
	}

}
