package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

class Student{  
	  String name;  
	  int age;  
	  
	  Student(String name, int age){  
	   this.name=name;  
	   this.age=age;  
	  }  
	}

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		//Adding elements to list object.
		list1.add("Ravi");
		list1.add("Kanchan");
		list1.add("Rishika");
		list1.add("Raunak");
		
		System.out.println("Printing values of list using Iterator.");		
		Iterator i1 = list1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
	
		System.out.println("Printing values of list using for loop");
		for(String str:list1)
			System.out.println(str);
	
		Student s1 = new Student("Raunak", 6);
		Student s2 = new Student("Rishika", 8);
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(s1);
		list2.add(s2);
		
		Iterator i2 = list2.iterator();
		while(i2.hasNext())
		{
			Student st = (Student) i2.next();
			System.out.println("Student Name: "+st.name+", Age: "+st.age);
		}
		
	}

}
