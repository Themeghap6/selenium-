package introduction;


/*****
****
***
**
*/

public class patterns {
	public static void main(String[] args) {
//			for(int r=1;r<=5;r++) { //number of raw=r
//			   for(int c=5;c>=r;c--) { // number of columm =c
//			System.out.print("*");
//			}
//			System.out.println();
//			}

		
		
/****/		
//		for(int r=1;r<=4;r++) {			
//			for(int c=1;c<=4;c++) {
//		}
//				System.out.print("*");
//			}
//			System.out.println();


		
/*
**
***
****/		
//		for(int r=1;r<=4;r++) {
//			for(int c=1;c<=r;c++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	

		
//1
//12
//123
//1234/	
		
//		for(int r=1;r<=4;r++) {
//			for(int c=1;c<=r;c++) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
	
		
//		1
//		22
//		333
//		4444
	
//		for(int r=1;r<=4;r++) {
//			for(int c=1;c<=r;c++) {
//				System.out.print(r);
//			}
//			System.out.println();
//		}
	
	

//      1
//		01
//		101
//		0101
//		10101	
		
		
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=r;c++) {
				if((r+c)%2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	
	}
}
		
	   
		
		
	

