package learningPrograms;

interface Cars{
	void brand();
}
interface Taxi extends Cars{
	void colour();
}

public class InterfaceDemo implements Taxi{
	public void colour() {
		System.out.println("Urban Blue.");
	}
	
	public void brand() {
		System.out.println("Baleno.");
	}

	public static void main(String[] args) {
		Taxi obj1 = new InterfaceDemo();
		obj1.brand();
		obj1.colour();
	}

}
