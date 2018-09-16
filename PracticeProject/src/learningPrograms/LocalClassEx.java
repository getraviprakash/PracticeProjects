package learningPrograms;

public class LocalClassEx {  
	 private int data=30;//instance variable  
	 
	 void display(){  
	
		 class Local{
			 void msg(){
				 System.out.println(data);}  
		 }
	  Local l=new Local();  
	  l.msg();  
	 }
	 
	 public static void main(String args[]){  
		 LocalClassEx obj=new LocalClassEx();  
	  obj.display();  
	 }  
	}  