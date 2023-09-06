package core.java;

import java.util.Scanner;

public class Armstrong5 {
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int n,arm=0,rem,c;
		 n=Sc.nextInt();		//n=153
		c=n;					//c=153
			while(n>0) {				//153>0
				rem =n%10;				//153%10  ,rem is 
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
			if(c==arm) {
				System.out.println("Armstrong Number");
			}
				else 
					System.out.println(" Not Armstrong Number");
				}
			}
	
		
		
		
	


