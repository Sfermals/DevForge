import java.util.Scanner;

public class P4_4_1_ifElse {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please choose conversion: ");
		System.out.println("1)CELSIUS >> FARENHEIT\n2)FARENHEIT >> CELSIUS ");
		
		int Con = sc.nextInt();
		
		if(Con==1) {
			System.out.println("Please enter celsius: ");
			double c = sc.nextDouble();
			
			double far = c2f(c);
			System.out.println(c + " Degrees Celsius is >> " + far + " Degrees farenheit");
			
		}
		else if(Con==2)
		{
			System.out.println("Please enter Farenheit: ");
			double f = sc.nextDouble();
			
			double cels = f2c(f);
			System.out.println(f + " Degrees farenheit is >> " + cels + " Degrees Celsius ");
			
			
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
