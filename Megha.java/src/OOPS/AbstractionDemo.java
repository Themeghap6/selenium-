package OOPS;
// abstract function make by abstract keyword and abstract unction end by semicolumn and and no body



abstract class RBI{				//abstract function
	abstract public void interrest();
	public void HL() {
	}
	public static void reporate() {
			System.out.println("reporate ;  +-4%");		
}
		}
class SBI extends RBI{
	public void interrest() {
		System.out.println("SBI : interrest : 7%");
	}
	public void HL() {
		System.out.println("SBI : HL : 8%");
	}
		}


class JAVA extends RBI{
	public void interrest() {
		System.out.println("JAVA : interrest : 8%");
	}
	public void HL() {
		System.out.println("JAVA : HL : 9%");
	}		
}
public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s=	new SBI(); 		// class accourding to object
		s.interrest();
		s.HL();
		JAVA J =new JAVA();
		J.interrest();
		J.HL();
		SBI.reporate();
		JAVA.reporate();
	}
			
}


