
public class testAndroid {

	public static void main(String[] args) {
		Android a1 = new Android();
		Android a2 = new Android(20, false);
		
		System.out.println(a1.selfIntro());
		
		a1.setAgeInMonth(200);
		a1.setrLegsBroken(true);
		System.out.println(a1.selfIntro());
		

	}

}
