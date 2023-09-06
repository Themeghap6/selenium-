package core.java;

import java.util.ArrayList;
import java.util.Iterator;

import collectionFramework.Mobile;

public class ArrayListIteration19 {
		public static void main(String[] args) {
			        ArrayList<Integer> numbers = new ArrayList<>();
			        numbers.add(10);
			        numbers.add(20);
			        numbers.add(30);
			        numbers.add(40);
			        numbers.add(50);
			        System.out.println("Array elements");
					Iterator<Integer> iterator = numbers.iterator();
						while( iterator.hasNext()) {
						System.out.println( iterator.next());
		}
}
}