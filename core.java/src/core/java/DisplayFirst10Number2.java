package core.java;

import java.util.Scanner;

public class DisplayFirst10Number2 {
  public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
			System.out.println("Enter Number :");
				int Num=Sc.nextInt();
				int N = 1;
			while (N <= 10) {
				System.out.println(N);
				N++;
			}
  		}
}