package introduction;

         // static variable:to allocate same memory for every object if variable same 
		 // static method : call by directly class
		//static block -> will execute before main

public class Static {
	
	class student{
		
		int id;
		stringsss name;
		long contact; 
		static String cname = "TOPS";  // static allocation memory store 
		

		// static method

public void call() {
	id =12;
		System.out.println("call method in student class");  // non static method
		student s = new student();
		s.call();
		}
		
public static void calling() {
	//id =12;
		System.out.println("static method in student class"); // static method
		student.calling();
		}
	static 
		{											         // static block
	System.out.println("static block in student class");
	}	
	
	
		}

}
  
