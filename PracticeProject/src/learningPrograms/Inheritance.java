package learningPrograms;

    class SuperClass {
    	int iSuper = 1; 
    	public void displayResult() {
        System.out.println("Superclass Called.");
   	    }
    }

    class SubClass extends SuperClass {
    	int iSub = 2;
        public void displayResult() {
            System.out.println("Displaying from subClass");
            //super.displayResult();
        }
    }

   public class Inheritance {

    	   public static void main(String args[]) {
    		   
    		   SuperClass obj1 = new SuperClass();
    		   obj1.displayResult();
    		   //Object has access to Super class only.
    		   System.out.println(obj1.iSuper);
    		   
    		   SubClass obj2 = new SubClass();
    		   obj2.displayResult();
    		   //Object has access to both Super and Sub classes.
    		   System.out.println(obj2.iSuper);
    		   System.out.println(obj2.iSub);
    		   
    		   SuperClass obj3 = new SubClass();
    		   obj3.displayResult();
    		   //Object has access to Super class only.
    		   System.out.println(obj3.iSuper);
     	   
    	   }
    }
