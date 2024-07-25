
public class P3_Q3_4_B {
	public static void main(String[]args) {
		
		int num = 22; // can change greater then which value here
		int sq = 0; 
		int i=0;
		
		do {

			sq = i*i;
			System.out.println(i + "*"+ i + "=" + sq);
			i++;
		}while(sq < num);
		
		System.out.print("\nSMALLEST POSITIVE INTEGER that the square is greater then " + num + " is: " + (i-1));
		
		
	}

}


