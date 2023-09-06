package introduction;

import java.util.Scanner;
	// the loop is to excute same code again and again
	// 4 type of loops
	//1. for (initilization;condition;incre/decre){body}
	//2.while(condition){body}
	//3.do{body}while(condition);
	//4.for each -> for(Type object: list){body}

public class practice {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("for loop");
	int num =Sc.nextInt();
	for(int i=10;i>=1;i--) {
		System.out.println(i);
	}
	System.out.println("while loop");Ṇ j = 1;
	while(j<=10) {
		System.out.println(j);
		j++;
	}
	System.out.println("do while loop");
	int k = 112;
	do {
		System.out.println(k);
		k++;
	}
	while(k<=10);
}



	  }
	
