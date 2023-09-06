package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//collection framework -> is framework that provides an architecture to manipulate group of objects.
//Root INterface -> Iterable
//List,Set,Map-collection of sub interface
//<generics>
public class ListDemo {
	public static void main(String[] args) {
	//	List list = new ArrayList();
		ArrayList list = new ArrayList();
		list.add(2);			//list datatype
		list.add("megha");
		list.add('t');
		list.add(136687);
		list.add(40.3);
		list.add(false);
		System.out.println(list);
		list.add(3);
		System.out.println(list.size());			//size check
		list.remove(5);
		System.out.println(list);
		Iterator itr =list.iterator();				//to frach the data iterator for single element to frach
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
