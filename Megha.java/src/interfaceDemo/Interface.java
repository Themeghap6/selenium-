package interfaceDemo;
//interface-> is same as class but not class.
//can not create object of interface 
//can create reference of interface
//by defualt all properties are abstract in interface
//if provides 100% abstraction
//when work with class implements keyword uses
//multiple class cannot inherited but
//we can implement more then one interface in single class
//when interface is implemented  than properties of interface should be defined/implements in class
//by using interface we can slove multipal and hierarchical in java
//it more than secure of abstraction

class InterImple implements inter1,inte2{

	@Override
	public void interfaace3() {			// properties 123....
		// TODO Auto-generated method stub
		System.out.println("interface3 3");
	}

	@Override
	public void interfaace2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}

	@Override
	public void interfaace1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}
	
}
public class Interface {
	public static void main(String[] args) {
		InterImple i = new InterImple();
		i.interfaace1();
		i.interfaace2();
		i.interfaace3();
		inter1.interfaceeee1();
		inte2.interfaceeee2();
		inte3.interfaceeee3();
	}
}