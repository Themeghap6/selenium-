	package core.java;

import java.util.Scanner;

public class PrimeNumber4 {
			
	public static void main(String[] args) {
		int n ,counter=0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		n=Sc.nextInt();
		for(int i=1;i<=n;i++){	
			if(n%i==0) 	{
			counter++;	//variable	
			}
		}
		if (counter==2)		//
			System.out.println("prime number");
		else
			System.out.println("not prime ");
	}
	}

