package OOPS;
//oops : object oriented programming system/structure
//1.class : structure in which 
//			we can have member function and member variables are there
//2.object : instance  of class

//3.inheritance : to access property one class to another class
//types of inheritance 1. single 2. multiple(ambiguity) 3.multilevel  4.c5. hybrid
// multiple and hierarchical is not supported in java because at the same time  multiple class extends not possible and
//4. polymorphism : same function name but having different functionality
// types   1.Compile time (overloading):
//		   2.Runtime (overriding)

//5.Abstraction -> hiding internal details and showing only 
//					essential information to user

//6.Encapsulation-> wrapping up data into single unit

class A{		//parent  or base
	 A(){
		 System.out.println("A class cons");
		 }
	 public void classA() {	 
		 System.out.println("class A function");
	 		}	
		}

class B extends A {			//chid or derived
	
	 public void classB() {		
		 System.out.println("class B function");
	 }
}

class C extends B {
	
	public void classC() {
		System.out.println("class c function");	
	}
}
class D extends A{
	
	public void classD() {
		System.out.println("class D function");

	}
}
public class InheritanceDEmo {
	public static void main(String[] args) {
		B b =new B();
		b.classA();
		b.classB();
		C c= new C();
		c.classA();
		c.classB();
		c.classC();
	
	}
}
