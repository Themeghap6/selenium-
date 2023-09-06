package core.java;

public class ConcatenateStringe14 {
			public static void main(String[] args) {
				String S ="I am Megha Patel .";
				String S1="I am 25 Years old";	
				
				System.out.println(S);
				System.out.println(S1);
				
				// Concatenate the two strings together.
				String S2 = S.concat(S1);
				
				// Display the new String.
				System.out.println("The concatenated : " + S2);
			}
}
