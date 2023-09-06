package core.java;

 class A extends Thread{
	 private void run() {
		 
		 for(int i=1;i<=5;i++) {
			 System.out.println("My name is megha");
		 }
	}
 
 }
 
public class ExtendingThread18 {
	public static void main(String[] args) {
			A t= new A();
			t.start();
		
			for(int i=1;i<=5;i++) {
				 System.out.println("main method");
			 }
}
}
