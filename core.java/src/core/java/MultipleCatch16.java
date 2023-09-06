package core.java;

import java.util.Scanner;

public class MultipleCatch16 {
				public static void main(String[] args) {
					int [] marks = new int[3];
					marks[0]= 5;
					marks[1]=56;
					marks[2]=6;
					Scanner Sc= new Scanner(System.in);
					System.out.println("Enter the Array Index");
					int i = Sc.nextInt();
					
					System.out.println("Enter the number you want to divied  the value with ");
					int number = Sc.nextInt();
					
					try {
						System.out.println("The value at array index entered is : " + marks[i]);
						System.out.println("The value of array number is :  " + marks[i]/number);
					}
					catch (ArithmeticException e) {
						System.out.println("ArithmeticException occured!");
						System.out.println(e);
					}
					catch  (ArrayIndexOutOfBoundsException e) {
						System.out.println("ArrayIndexOutOfBoundsException occured!");
						System.out.println(e);
					}
					catch (Exception e) {
						System.out.println("some other exception occured!");
						System.out.println(e);
					}
					}
					
					}

