package core.java;

import java.util.Scanner;

public class Displaygrade26 {
			public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
	        System.out.println("enter marks : ");
     		int marks = sc.nextInt();
     		if (marks <= 40) {
     			System.out.println("fail");
     		} else if (marks >= 41 && marks <= 50) {
     			System.out.println("DD grade");
     		} else if (marks >= 51 && marks <= 60) {
     			System.out.println("CD grade");
     		} else if (marks >= 61 && marks <= 70) {
     			System.out.println("BC grade");
     		} else if (marks >= 71 && marks <= 80) {
     			System.out.println("BB grade");
     		} else if (marks >= 81 && marks <= 90) {
     			System.out.println("AB grade");
     		} else if (marks >= 91 && marks <= 100) {
     			System.out.println("AA+ grade");
     		} else {
     			System.out.println("invalid input");
     		}

	}
}
