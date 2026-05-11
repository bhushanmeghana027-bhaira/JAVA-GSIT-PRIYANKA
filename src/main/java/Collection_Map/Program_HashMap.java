package Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program_HashMap {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(30,"D");
		map.put(1,"AA");
		map.put(10,"B");
		map.put(2,"C");
		map.put(49,"E");
		map.put(5,"F");
		map.put(6,"G");
		
		for(Entry<Integer,String>entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
}
