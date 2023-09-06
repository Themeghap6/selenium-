package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//map data will store as key value pair
//single key value pair is called as entry
//key should not be duplicated  & value cane be duplicat
public class MapDemo {
		public static void main(String[] args) {
			Map map = new HashMap();
			map.put(1,"c");		//entry
			map.put(2, "c++");
			map.put(3, "java");
			map.put(4, "python");
			map.put(null, null);
			map.put(5, "java");
			System.out.println(map);
			Set set =map.entrySet();			//convert map data in set 
			Iterator itr=set.iterator();
			while(itr.hasNext()) {
				Map.Entry entry = (Entry)itr.next();		// for fetch a single value n key 
				System.out.println("key : "+entry.getKey());
				System.out.println("value : "+entry.getValue());
			}
		}

}
