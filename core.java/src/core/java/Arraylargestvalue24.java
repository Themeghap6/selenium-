package core.java;

import java.util.Scanner;

public class Arraylargestvalue24 {
	 public static void main(String[] args) {
		 Scanner Sc= new Scanner(System.in);
			int a[]= new int[5];
			
			System.out.println("Enter elemets in array : ");
			for(int i=0;i<5;i++) {
				a[i]=Sc.nextInt();	
			}
			int max = a[0];
			for(int i=1;i<5;i++) {
				if(a[i]>max) {
					max=a[i];
				}
				
			}
			System.out.println("The largest elements in array: "  +max);
			
	}
}
	

