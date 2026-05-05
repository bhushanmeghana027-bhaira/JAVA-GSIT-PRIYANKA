package May4;

import java.util.LinkedHashSet;
import java.util.Set;



public class RemoveDuplicate {
	public static void main(String[] args) {
		String ques = "java is easy and java is powerful and easy";
		Set<String> s = new LinkedHashSet<String>();
		
		String ques1[] =  ques.split(" ");
		for(String word:ques1) {
			if(!s.contains(word)) {
				s.add(word);
			}
		}
		for(String h:s) {
			System.out.print(h+" ");
		}
	}
}
