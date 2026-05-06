package May5;

import java.util.HashMap;
import java.util.Map;

public class Letter_frequency_Map {
	public static void main(String[] args) {
		String s = "aaabbc";
		Map<Character ,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<=s.length()-1;i++) {
			char letter = s.charAt(i);
			if(!map.containsKey(letter)) {
				map.put(letter, 1);
			}
			else {
				map.put(letter,map.get(letter)+1);
			}
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()){
		    System.out.print(entry.getKey() + "" + entry.getValue());
		}
	}

}
