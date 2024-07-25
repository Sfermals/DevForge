import java.util.Scanner;

public class P4_4_1_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Please choose conversion: ");
		System.out.println("1)CELSIUS >> FARENHEIT\n2)FARENHEIT >> CELSIUS  ");
		int choice = sc.nextInt();
		
		
	
		switch(choice){
			
			case 1: //==================celsius==========================================
						System.out.println("Please enter celsius: ");
						int c = sc.nextInt();
					
						double far = c2f(c);
						System.out.println(c + " Degrees Celsius is >> " + far + " Degrees farenheit");
			
				break;
			case 2: //==================farenheit==========================================
						System.out.println("Please enter Farenheit: ");
						int f = sc.nextInt();
			
						double cels = f2c(f);
						System.out.println(f + " Degrees farenheit is >> " + cels + " Degrees Celsius ");
				break;
			default: 
				break;
		}
		
	}
		public static double f2c(double f)
		{
			double result;
			
			result =  (f - 32) / 1.8;
			
			return result;
		}
		public static double c2f(double c)
		{
			double result;
			
			
			
			result = (9.0/5)*c +32;
			
			return result;
		}
	

	}


