package core.java;



public class SumArray9 {

	    public static void main(String[] args) {
	    	
	        int[] array =  { 110, 20, 0, 140, 450 }; // Example array

	        int sum = 0; // Initialize a variable to store the sum

	        // Loop through the array and add each element to the sum
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }

	        System.out.println("Sum of the array elements: " + sum);
	    }
	}

