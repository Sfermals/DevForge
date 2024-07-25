
public class P3_Q3_3_C {
	public static void main(String[]args) {
		
		int n1 = 1;
		
		for(int j=1; j<10; j++) {
			if(j%2 == 0) {
				for (int i=1; i<10; i++) {
					if(i%2 == 0) {
						n1 =+ 2;
						System.out.print(j + "*" + i + "=" + (j*i)+"   ");
					}
					
				}
			}
			System.out.println();
		}

	}

}
