package core.java;

import java.util.Scanner;

public class FibonacciSeries6 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter term : ");
		int term=Sc.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=term;i++) 
	  {	
		System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}

}
