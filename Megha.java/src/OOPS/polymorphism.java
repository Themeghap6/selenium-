package OOPS;
//polymorphism : same function name but having different functionality
//types   1.Compile time (overloading)
//2.Runtime (overriding)

//1. overloading compile time : same function in differnt argument into same class
//2. overriding :same function in same argument into different  class and inheritance compulsory


//1. overloading
class AA{
	public void area(double r) {
	System.out.println("area of circle :"+(Math.PI*r*r));	
		}
	public void area(double h,double b) {
	System.out.println("area of tringle :" +((b*h)/2));
		}
	public void area(int h, int b) {
		System.out.println("area of rect : "+(l*b));
	}
}

public class polymorphism {
	public static void main(String[] args) {
		AA a = new AA();
		a.area(3.3);
		
		
	}
	
}

	 
	