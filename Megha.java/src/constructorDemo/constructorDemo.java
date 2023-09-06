package constructorDemo;
// constucrator : is special member function of class which has same as class name
// 				called automatically when object is created
//				have no return type
//				three type constructor
//				1. default 			2. parameterized		3. copy
class Demo{
		int i,j;
		Demo() {	//CLASS
		}
		Demo(int i){
			System.out.println("pata :" +i);
		}
		Demo(int i,int j){  			 //check data type not i,j variable
			this.i=i;                    //this keyword work as a obj
			this.j=j;
			System.out.println("para : i = " + i +" j = "+ j);
		}
		public void showData() {
			System.out.println("i = " + i + " j = " + j);
		}
}
public class constructorDemo {		//method & function
	public static void main(String[] args) {
		Demo d = new Demo();			//default
		Demo d1 = new Demo(23,345);   	//parameterized
		d1.showData();
	}
}

 
