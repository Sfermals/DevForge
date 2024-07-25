import java.util.Scanner;

public class P3_Q3_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		int i=0, n=0;
		float sum=0;
		System.out.println("Enter how many number to calculate: ");
		int x = sc.nextInt();
		
		float arr[] = new float[x];
        
        System.out.println("Enter " + x + " numbers: ");
        
        while(i<x) {
            arr[i] = sc.nextInt();
            if(arr[i] != 0) {
            	n++;
            }

            sum=sum+arr[i];
            i++;
        }
        float average = sum/n;
        System.out.println("Average of number is : "+average);
		
		
			
		
		
		
	}
}


