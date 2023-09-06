package core.java;

import java.util.Scanner;

public class FindMaxMinValueInArray12 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		
		//take a array size
		int Size=Sc.nextInt();
		
		//assign array to size
		int array[] = new int[Size];
		
		// to take user value in array
		System.out.println("Enter Array VAlue : ");
		for(int i=0; i<Size; i++) {
			int Value=Sc.nextInt();
			array[i]=Value;
			}
		
		//Find a max & min value of array
		int min=array[0]; 
		int max=array[0];
		for(int i=0; i<Size; i++) {
			if (array[i]>max) {
				max=array[i];
				System.out.println("MAximum Number : " + max);
			}
			else if (array[i]<min) {
				min=array[i];
				 System.out.println("Minimum Number : " + min);
			}
		}
				}
			
		}
		
		
	
	
	
