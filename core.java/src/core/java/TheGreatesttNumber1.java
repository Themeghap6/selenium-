package core.java;

import java.util.Scanner;

public class TheGreatesttNumber1 {
     	public static void main(String[] args) {
			Scanner Sc=new Scanner(System.in);
			System.out.println("enter number A :");
			int A =Sc.nextInt();
	
			System.out.println("enter number B :");
			int B =Sc.nextInt();
	
			System.out.println("enter number C :");
			int C=Sc.nextInt();
	
			if (A>B && A>C ) {
			System.out.println("The greatest Number is :  A");	
			}
			else if (B>A && B>C) {
				System.out.println("The greatest Number is : B ");	
			}
			else if (C>A && C>B) {
				System.out.println("The greatest Number is : C ");
			}
		
		}
}
	