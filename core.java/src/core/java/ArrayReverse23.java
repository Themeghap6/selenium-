package core.java;

import java.util.Scanner;

public class ArrayReverse23 {
		public static void main(String[] args) {
				Scanner Sc= new Scanner(System.in);
				int a[]= new int[5];
				
				System.out.println("Enter elemets in array : ");
				for(int i=0;i<5;i++) {
					a[i]=Sc.nextInt();	
				}
				for(int i=0;i<5;i++) {
					System.out.println(a[i]+" ");
				}
				// to reverse elements
				System.out.println("array reverse elemnts");
				for(int i=5-1;i>=0;i--) {
					System.out.println(a[i]+" ");
				}
				
				
				
}	
}