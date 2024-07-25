
public class P3_Q3_3_B {
	public static void main(String[]args) {
		
/*		for (int i=1; i<=99; i++)
	    {
	        if (i%2 !=0)
	        System.out.print(i + " " ); //print odd
	        
	        if(i%10 == 0)
	        System.out.println(); //every time reach number divided by 10 get remainder 0
	                              //it will print another line.. then loop start on next line
	    } //this one without nesting the for loop
*/	
		int num = 0;
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
	        	if(num%2 != 0) {
	        		System.out.print(num + " ");
	        	}
	        	num++;
	        }
	        System.out.println();
		}

	}
}


	


