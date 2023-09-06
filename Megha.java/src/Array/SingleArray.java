package Array;
//size of array and element
import java.util.Scanner;

public class SingleArray {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter size of array :");
		
		// take input for size of array & int is a variable
		int Size = Sc.nextInt();
		
		// to assign size to array
		int arr[] = new int[Size];
		
		// take user input in array
		for (int index = 0; index < arr.length; index++) {
			System.out.print("enter element at arr[\"+index+\"] : ");
			arr[index] = Sc.nextInt();
		}
		
		// addication of elements
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
			System.out.println("sum =" + sum);
		}
		
		// binary search the element in array
		System.out.println("enter number to search in array");
		int num = Sc.nextInt();
		int counter = 0;
		for (int index = 0; index < arr.length; index++) {
			if (num == arr[index]) {
				counter++; // counter is a variable
			}
		}
		if (counter>0) {
			System.out.println("yes"+num+"is exist" +counter+ "times");
		}
		else {
			System.out.println("no");
		}
		
		// static void main syntax
		int i[]= {1,2,3,4,5,6,7,8,9,10,11};
		for(int index = 0;index<=10;index++) {
			System.out.println(i[index]);
		}
	}
}


