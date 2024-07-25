import java.util.Scanner;

public class P3_Q3_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num > num2 && num > num3) {
		    if (num2 > num3) {
		        System.out.println("Order: " + num3 + " " + num2 + " " + num);
		    } else {
		        System.out.println("Order: " + num2 + " " + num3 + " " +num);
		    }
		} else if (num2 > num3) {
		    if (num > num3) {
		        System.out.println("Order: " + num3 + " " + num + " " + num2);
		    } else {
		        System.out.println("Order: " + num + " " + num3 + " " + num2);
		    }
		} else {
		    if (num > num2) {
		        System.out.println("Order: " + num2 + " " + num + " " + num3);
		    } else {
		        System.out.println("Order: " + num + " " + num2 + " " + num3);
		    }
		}
	
	}

}
