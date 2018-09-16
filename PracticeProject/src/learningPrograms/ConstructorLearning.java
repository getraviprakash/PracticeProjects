package learningPrograms;

class SuperClass1 {
	SuperClass1() {
    System.out.println("Superclass Called.");
	    }
}

class SubClass2 extends SuperClass1 {
	 SubClass2() {
        System.out.println("Displaying from subClass");
    }
}
public class ConstructorLearning {
	
	//This is a constructor, whose name is same as the class name and 
	//It doesn't have any explicit return type.
	ConstructorLearning(){
		System.out.println("This will be printed automatically on object creation.");
	}
	
	ConstructorLearning(int a){
		System.out.println("A class can have multiple constructors.");
	}

	public static void main(String[] args) {
		
		SubClass2 obj2 = new SubClass2();
		/*In case of inheritance, when a new object of a derived class is created, 
		 * first the constructor of the super class is invoked 
		 * and then the constructor of the derived class is invoked. 
		 */
		
		//Creation of object will call the constructor of class.
		ConstructorLearning cl1 = new ConstructorLearning();
		System.out.println("First Constructor has been called successfully.");
		ConstructorLearning cl2 = new ConstructorLearning(5);
		System.out.println("Second Constructor called successfully.");
	}

}
