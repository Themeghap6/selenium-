package core.java;

abstract class parent{
	  public  abstract void  message();		 
} 
 
class Firstsubclass extends parent{
	public void message() {
		System.out.println(" This is the first subclass");	
	}
}

class Secondsubclass extends parent{
	public void message() {
		System.out.println(" This is the second subclass");
		
	}
}
public class AbstractClass {
		public static void main(String[] args) {
			parent obj1=new Firstsubclass();
			parent obj2= new Secondsubclass();
			
			obj1.message();
			obj2.message();
		}
}
