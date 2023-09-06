package introduction;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num to print table :");
		int num = sc.nextInt();
		int a = 1;
		while (a <= 10) {
			System.out.println(num + " x " + a + " = " + (num * a));
			a++;
		}

		System.out.println("do while loop");
		int b = 1;
		do {
			System.out.println(num + " x " + b + " = " + (num * b));
			b++;
		} while (b <= 10);

	}

}
