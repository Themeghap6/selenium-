package core.java;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
//1
//12
//123
//1234
//12345/
		
//		for(int r=1;r<=5;r++) {
//		for (int c=1;c<=r;c++) {
//			System.out.print(c);
//		}
//		System.out.println();
//	}
	
		
		

//1
//01
//101
//01010
//101010

//		for(int r=1;r<=3;r++) {
//			for(int c=1;c<=r;c++) {
//				if((r+c)%2 == 0) {
//					System.out.print("1");
//				}
//			else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
//		
//		
//		for(int r=5;r<=5;r++) {
//			for(int c=1;c<=r;c++) {
//				if((r+c)%2 == 0) {
//					System.out.print("0");
//				}
//			else {
//					System.out.print("1");
//				}
//			}
//			System.out.println();
//		}
//		for(int r=6;r<=6;r++) {
//			for(int c=1;c<=r;c++) {
//				if((r+c)%2 == 0) {
//					System.out.print("0");
//				}
//			else {
//					System.out.print("1");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//	 *
// * * *
//* * * * * 
// * * *
//   *
//		for(int r=1;r<=1;r++) {
//		for(int c=1;c<=r;c++) {
//				System.out.print("      *   ");
//			}
//			System.out.println();
//		}
//		for(int r=3;r<=3;r++) {
//			for(int c=1;c<=r;c++) {
//					System.out.print("  * ");
//				}
//				System.out.println();
//		
//		}
//		for(int r=5;r<=5;r++) {
//			for(int c=1;c<=r;c++) {
//					System.out.print(" * ");
//				}
//				System.out.println();
//		
//		}
//		for(int r=3;r<=3;r++) {
//			for(int c=1;c<=r;c++) {
//					System.out.print("  * ");
//				}
//				System.out.println();
//		
//		}
//		
//		for(int r=1;r<=1;r++) {
//			for(int c=1;c<=r;c++) {
//					System.out.print("      *   ");
//				}
//				System.out.println();
//			}
		
//1
//2 2 
//3 3 3
//4 4 4 4	
	         int n=4;
			 for (int r = 1; r <= n; r++) {
				 for (int c= 1; c <= n - r; c++) {
		                System.out.print(" ");
		            } 
				 for (int c = 1; c <= r; c++) {
		                System.out.print(r + " ");
		            }
				 System.out.println();
			 }
     }
}
	

	
	

		
		
		
		

	
		
		
		
		
		
		

	
		