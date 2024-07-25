
public class Android extends Robot{
	
	private boolean rLegsBroken;
	
	public Android() {
		super(10);
		rLegsBroken = false;
	}
	 public Android(int ageInMonth, boolean rlegsBroken) {
		 super(ageInMonth);
		 this.rLegsBroken = rLegsBroken;
	 }
	public boolean isrLegsBroken() {
		return rLegsBroken;
	}
	public void setrLegsBroken(boolean rLegsBroken) {
		this.rLegsBroken = rLegsBroken;
	}
	 
	public String selfIntro() {
		String result = "";
		if (rLegsBroken == true)
			System.out.print("can't walk");
		else {
			result = "can walk slowly";
		}
		
		if(getAgeInMonth()> 120) {
			result += "too old, better retire now";
		}else {
			result = "can still work.";
		}
		return result;
	}
	

}
