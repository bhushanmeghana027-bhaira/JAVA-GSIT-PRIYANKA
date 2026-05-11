package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program1_Set {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>();
		setA.add(10);
		setA.add(10);
		setA.add(10);
		setA.add(10);
		setA.add(20);
		setA.add(30);
		
		System.out.println(setA);
		for(int a:setA) {
			System.out.println(a);
		}
		
		Iterator<Integer> it = setA.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
