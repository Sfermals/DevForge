
public class Vehicle {
	
	private int wheelNo; //a)
	
	public Vehicle(){ 
		wheelNo = 3;   //b)
	}
	public Vehicle(int wheelNo) {
		this.wheelNo=wheelNo;
	}
	
	public int getWheelNo() { //d
		return wheelNo;
	}  
	
	public void setWheelNo(int wheelNo) { //c
		this.wheelNo = wheelNo;
	}
	
	public void describe() {
		System.out.print("This have " + wheelNo + " wheels"); //f
	}

	
}
