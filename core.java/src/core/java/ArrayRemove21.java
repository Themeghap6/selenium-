package core.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayRemove21 {
	
	public static void main(String[] args) {
		List<String> list_Col = new ArrayList<String>();
		list_Col.add("Black");
		list_Col.add("Red");
		list_Col.add("Orange");
		list_Col.add("White");
		list_Col.add("Green");
		System.out.println(list_Col);
		// remove elements
		list_Col.remove(4);
		
		System.out.println(list_Col);
	}
	}

