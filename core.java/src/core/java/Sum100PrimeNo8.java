package core.java;

import java.util.Scanner;

public class Sum100PrimeNo8 {
	
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int count = 0; // To keep track of prime numbers found
	        int num = 2;   // Starting from the first prime number
	        long sum = 0;  // To store the sum of prime numbers

	        while (count < 100) {
	            if (isPrime(num)) {
	                sum += num;
	                count++;
	            }
	            num++;
	        }

	        System.out.println("Sum of the first 100 prime numbers: " + sum);
	    }
	}


//	public static void prime(int number) {
//		for(int i=2;i<=number;i++) {
//			int count=0;
//			for(int j=2;j<i;j++) {
//					if(i%j==0) {
//						count++;
//		}	
//	}		
//		if (count==0) {
//			System.out.print(i+" ");
//		}
//			}
//	}
//	public static void main(String[] args) {
//		Sum100PrimeNo8.prime(100);
//	}
//}
//		
		
		
			
		

