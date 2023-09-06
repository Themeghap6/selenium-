package core.java;

import java.util.Scanner;

public class Averagevalueofarray10 {
	public static void main(String[] args) {
		// reading the array size.
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter an array size : ");
		int Size= Sc.nextInt();
		
		//create an array 
		int [] array =new int [Size];
		
		// user will be enter a value
		System.out.println("Enter array value : ");		//for loop
		for (int i=0 ; i<Size ; i++) {
			int Value = Sc.nextInt();
			array[i]=Value;
		}
		//getting array length
		int lenght=array.length;
		int sum=0;
		
		// sum of all values in array using for loop
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
			double avg=sum/lenght;
			System.out.println("Average of array : " + avg);
		}
		
		}
		
		
		
	

