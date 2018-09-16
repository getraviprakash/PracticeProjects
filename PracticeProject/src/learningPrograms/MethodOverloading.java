package learningPrograms;

public class MethodOverloading {

	public void print() {
		System.out.println("Printing without Parameters");
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj1 = new MethodOverloading();
		obj1.print();
		obj1.print("Ravi");
	}
}
