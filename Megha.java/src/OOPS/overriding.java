package OOPS;
//overriding :same function in same argument into different  class and inheritance compulsory


class parant{
	public void call() {
			System.out.println("parant calling");
		
	}
}
class child extends parant{
	public void call() {
			System.out.println("child calling");
			super.call();		//parant call functionalyti call 
}
public class overriding {
	public static void main(String[] args) {
		child c =new child();
		c.call();
	}
}

}
