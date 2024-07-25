
public class Car extends Vehicle{
	
	private double age;
	
	public Car(){
		super(4);
		age = 1;
	}
	
	public Car(int wheelNo, double age) {
		super(wheelNo);
		this.age = age;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
	
	public void describe() {
		if (age<3) {
			System.out.println("It is relatively new");
		}else if (age <9){
			System.out.println("It serves too long.Please drive carefully");
		}else {
			System.out.println("Scrape!");
		}
	}
	
	

}
