import java.util.Scanner;

public class P3_Q3_2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter quiz mark..\n");
		int Jmark = sc.nextInt();
		
		//while(Jmark != -1) {
		
		do {	
				if((Jmark >= 80) && (Jmark <= 100)) {
					System.out.print("A");
					break;
				}
				else if((Jmark >= 70) && (Jmark <= 79)){
					System.out.print("B");
					break;
				}
				else if((Jmark >= 60) && (Jmark <= 69)){
					System.out.print("C");
					break;
				}
				else if((Jmark >= 50) && (Jmark <= 59)){
					System.out.print("D");
					break;
				}
				else if((Jmark >= 0) && (Jmark <= 49)){
					System.out.print("F");
					break;
				}
				else {
					System.out.print("invalid\n");

					System.out.println("Enter quiz mark..\n");
					Jmark = sc.nextInt();
				}
			}
			while(Jmark != -1);
	}
}
		
	



