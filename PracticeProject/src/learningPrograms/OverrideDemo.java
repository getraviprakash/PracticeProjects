package learningPrograms;

class Animal {
	void Sound() {
		System.out.println("Different sounds");
	}
}

public class OverrideDemo extends Animal {
	void Sound() {
		System.out.println("wooof....");
	}

	public static void main(String[] args) {
		//Three ways to create an object:
		Animal a1 = new Animal();
		a1.Sound();			//Calls Parent class method
		
		OverrideDemo a2 = new OverrideDemo();
		a2.Sound();			//Calls Child class method
		
		Animal a3 = new OverrideDemo();
		a3.Sound();			//Calls Child class method
		
	}
}
