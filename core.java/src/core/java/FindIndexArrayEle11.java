package core.java;

import java.util.Scanner;

public class FindIndexArrayEle11 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter array Size : ");
		
		// take input for size of array & int is a variable
				int Size = Sc.nextInt();
		//assign size to array
				int array[]=new int[Size];
		// to take user value  in array
				System.out.println("Enter Array Value : ");
				for(int i=0;i<Size;i++) {
					int Value = Sc.nextInt();
					array[i]=Value;
				}
				System.out.println("enter number to search in array");
				int num = Sc.nextInt();
				int counter = 0;
				for (int index = 0; index < Size; index++) {
					if (num == array[index]) {
						counter++; // counter is a variable
					}
				}
				if (counter>0) {
					System.out.println("yes" +num+"  is  exist"  +counter+  "times");
				}
				else {
					System.out.println("no");
				}
		
	}
}
