package Collection;

import java.util.ArrayList;

public class Program_ArrayList {
	public static void main(String[] args){
		
	
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);
		System.out.println(arraylist);
//		addAll method
		
		ArrayList<Integer> arraylist2 = new ArrayList<>();
		arraylist2.add(60);
		arraylist2.add(70);
		arraylist.addAll(arraylist2);
		System.out.println(arraylist);
		System.out.println("contains:"+arraylist.contains(100));
		System.out.println("Get:"+arraylist.get(0));
		System.out.println("Size:"+arraylist.size());
		arraylist.remove(0);
		System.out.println("arraylist after removal:"+arraylist);
		System.out.println("index of 70 is:"+arraylist.indexOf(70));
		System.out.println("is empty :"+arraylist.isEmpty());
		arraylist.set(0, 200);
		System.out.println("after update at 0th index:"+arraylist);
	}

}
