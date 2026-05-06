package May5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_Map {
	public static void main(String[] args) {
		String s = "the day today is a very very very warm day";
		String s1[]= s.split(" ");
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		int count =0;
		for(String eachWord:s1) {
			if(!map.containsKey(eachWord)) {
				map.put(eachWord, 1);
			}
			else {
				map.put(eachWord, map.get(eachWord)+1);
			}
			
		}
		System.out.println(map);
		
		
	}
}
