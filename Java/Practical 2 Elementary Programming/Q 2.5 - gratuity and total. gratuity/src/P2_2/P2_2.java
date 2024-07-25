package P2_2;

import java.util.Scanner;

public class P2_2 {
	public class PracticalTwo_question2 {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
		
			
		
			
			System.out.println("Enter the subtotal");
			double sub = sc.nextDouble();
			
			System.out.println("Enter the gratuity rate");
			double gratRate = sc.nextDouble();
			
			double graT = sub* gratRate/ 100;
			double total = sub + graT;
			

			System.out.println("The gratuity is" + graT + " and " + "total is " + total);
			
			
		}	
		}

}
