package Array;

import java.util.Scanner;

// multidimactional array for  matrix 

public class multiArray {
		public static void main(String[] args) {
		// too static method
			System.out.println("static array");
			int a[][] = {{1,2,3},{4,5,6},{7,8,9}}; //[] [] multi array
					for (int r=0;r<=2;r++) {
						for (int c=0;c<=2;c++) {
					System.out.print(a[r][c]+ " ");
						}
						System.out.println();
					}
			
		// too user input
					Scanner sc = new Scanner(System.in);
					System.out.println("enter number of row : ");
					int row = sc.nextInt();
					System.out.println("enter number of column : ");
					int col = sc.nextInt();
		// array 1		
					int arr[][] = new int[row][col];
					for(int i=0;i<row;i++) {
						for(int j=0;j<col;j++) {
							System.out.print("enter element at arr["+i+"]["+j+"] : ");
							arr[i][j] = sc.nextInt();
						}
						System.out.println();
					}
					
					System.out.println("final output array 1");
					for(int i=0;i<row;i++) {
						for(int j=0;j<col;j++) {
							System.out.print(arr[i][j]+" ");
						}
						System.out.println();
					}
		//array 2			
					System.out.println();
					int arr2[][] = new int[row][col];
					for(int i=0;i<row;i++) {
						for(int j=0;j<col;j++) {
							System.out.print("enter element at arr["+i+"]["+j+"] : ");
							arr2[i][j] = sc.nextInt();
						}
						System.out.println();
					}
					System.out.println("final output array 2");
					for(int i=0;i<row;i++) {
						for(int j=0;j<col;j++) {
							System.out.print(arr[i][j]+" ");
						}
						System.out.println();
					}
		// addication of array 1 and array 2			
					System.out.println();
					int arr3[][] = new int[row][col];
					for(int i=0;i<row;i++) {
						for(int j=0;j<col;j++) {
							arr3[i][j] = arr[i][j]+arr2[i][j];
						}
						System.out.println();
					}
					for(int i=0;i<row;i++) {
						for(int j=0;j<col;j++) {
							System.out.print(arr3[i][j]+" ");
						}
						System.out.println();
					}
		}
}
				
					

			
			
		
