package core.java;
//number format  exception
public class TryCatchBlock15 {
	public static void main(String[] args) {
		int a = 6000;
		int b = 0;
		
//		// without try 
//		int c = a/b;
//		System.out.println("the result " + c);
		
		// with try
		try {
			int c = a/b;       // try to run  in this 
			System.out.println("the result " + c);
		}
		catch(ArithmeticException e){     // e is a exception object
			System.out.println("we failed to divied . reason : ");		// n catch with exception
			System.out.println(e);
			
		}
		
		System.out.println(" End of Program");
	}
	

}
