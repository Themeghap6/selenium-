package ExceptionHandling;
// exception : abnormal situation occure at runtime
//types of exception
//1. checked : class ehich directly inherit throwable class
//2. unchecked:class which inherites runtimeexception clas
//3. error:as per oracle
////	To handle exception there are 5 keyword
//1.Try :
//2.Catch :
//3.Finally :have to  be execute block of  code  anyhow
//4.Throw : can handle single exception
//5.Throws: can handle multipal exception its called method signature

import java.util.InputMismatchException;
import java.util.Scanner;
class Division {	//a				//class
	public void divide() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b<0) {
			throw new ArithmeticException("denominator cannot be zero");
			
		}
		int c = a/b;
		System.out.println(c);
	}
}
public class ExceptionDemo {		//b
	public static void main(String[] args) {
			try {
			Division d = new Division();		// object
			d.divide();							// object method to call
			}
				catch(ArithmeticException e) {
					System.out.println("denominator cannot be zero");
			}
				catch(InputMismatchException e) {
					System.out.println("denominator should be numeric value");
				}
			}
			
		
	}
		
		
//		try{
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("enter a = ");
//		int a = sc.nextInt();
//		System.out.println("enter b = ");
//		int b = sc.nextInt();
//		int c = a/b;
//		System.out.println(c);
//		System.exit(54);
//		} 
//		catch (ArithmeticException e) {
//			System.out.println("denominator cannot be zero");		
//			}
//		catch (InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		}
//		catch (Exception e) {
//			System.out.println("error");
//		}
//		finally
//		{			
//			System.out.println("this will exceute everytime");
//	}
//	}
//}