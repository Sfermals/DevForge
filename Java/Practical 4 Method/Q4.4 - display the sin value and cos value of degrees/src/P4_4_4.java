
public class P4_4_4 {

	public static void main(String[] args) {
		
		double deg=0;
		
		System.out.println("Degree \t\t\tSin \t\t\tCos");
		
		for(int i=0; i<37; i++) {
			
			double valRad = Math.toRadians(deg);
			double sine = Math.sin(valRad);
			double cos = Math.cos(valRad);
			
			
			
			System.out.println(deg + "\t\t" + sine + "\t\t\t\t" + cos );
			
			deg += 10;
			
		}

	}

}
