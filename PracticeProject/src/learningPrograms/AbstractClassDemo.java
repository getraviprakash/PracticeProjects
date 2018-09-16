package learningPrograms;

abstract class Bike{			//abstract class
	abstract void run();		//abstract method of abstract class

	public void disp() {
		System.out.println("Concrete method of Abstract class.");
	}

}

class Bajaj extends Bike {
	void run() {				//Overidden method.
		System.out.println("Bajaj bike is running.");
	}
}
class AbstractClassDemo{
	public static void main (String args[]) {
		//Object cannot be created of an abstract class using new operator.
		//Hence child class need to be used after new operator.
		Bike b = new Bajaj();
		b.run();
		b.disp();
		
	}
}