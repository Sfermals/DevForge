
public class Robot {
	
	private int ageInMonth;
	
	public Robot() {
		ageInMonth = 1;
	}
	
	public Robot(int ageInMonth) {
		this.ageInMonth=ageInMonth;
		
	}

	public int getAgeInMonth() {
		return ageInMonth;
	}

	public void setAgeInMonth(int ageInMonth) {
		this.ageInMonth = ageInMonth;
	}
	
	public String selfIntro() {
		return "I am " + ageInMonth + "months old";
	}
	

}
