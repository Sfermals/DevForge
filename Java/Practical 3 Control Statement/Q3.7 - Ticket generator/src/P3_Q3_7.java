
import java.util.Scanner;

public class P3_Q3_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			
			System.out.print("\nWelcome CPB Services!\n \nEnter selection for services: ");
			
			System.out.print("\n1) Deposit \n2) Withdraw \n3) Open New Account \n4) Other Services\n");
			
			System.out.print("\noption: ");
			
			int select = sc.nextInt();
		
			
			switch(select) {
			
			case 1: System.out.print("1");
				return;
			case 2: System.out.print("2");
				return;
			case 3: System.out.print("3");
				return;
			case 4: System.out.print("4");
				return;
			default : System.out.print("You have choose an invalid choice\n (Returning to main Menu...)\n");
			    break;  
			        
			}
		         
			
		
		}
		
		
		
		
		
		
	}

}
