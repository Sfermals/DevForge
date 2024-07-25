
public class TestCar {

	public static void main(String[] args) {
		
		Car honda = new Car();
		Car toyota = new Car(4,5);
		
		honda.describe();
		honda.setAge(10);
		honda.describe();

	}

}
