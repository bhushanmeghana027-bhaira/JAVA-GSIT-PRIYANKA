package Week8ArrayList;

import java.util.ArrayList;
import java.util.List;

class Mobile{
	String brand , model;
	int price;
	
	Mobile(String brand,String model,int price){
		this.brand=brand;
		this.model = model;
		this.price = price;
	}
	void displayDetails() {
		System.out.println(brand+" "+model+" "+price);
	}
}
public class MobileStore {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", "S23", 70000);
		Mobile m2 = new Mobile("Apple", "iPhone 15", 80000);
		Mobile m3 = new Mobile("OnePlus", "12", 60000);
		Mobile m4 = new Mobile("Vivo", "V30", 35000);
		Mobile m5 = new Mobile("Realme", "GT", 30000);
		
		List<Mobile> li = new ArrayList<>();
		li.add(m1);
		li.add(m2);
		li.add(m3);
		li.add(m4);
		li.add(m5);
		
		System.out.println("Orginal mobiles:");
		for(int i=0;i<li.size();i++) {
			li.get(i).displayDetails();
		}
		
		System.out.println("After Sorting Descending:");
		for(int j=0;j<li.size()-1;j++) {
			for(int k=0;k<li.size()-1;k++) {
				if(li.get(k).price<li.get(k+1).price) {
					Mobile temp=li.get(k);
					li.set(k, li.get(k+1));
					li.set(k+1, temp);
				}
			}
		}
		for(Mobile m:li) {
			m.displayDetails();
			System.out.println("*-*-*-");
		}
		
		for(int h=0;h<li.size()-1;h++) {
			if(h==0) {
				li.remove(h);
			}
		}
		System.out.println("After removeing highest costliest phone");
		for(Mobile m:li) {
			m.displayDetails();
			System.out.println("*-*-*-");
		}
		
		String toBeFound = "Vivo";
		for(int q =0;q<li.size()-1;q++) {
			if(li.get(q).brand.equals(toBeFound)) {
				System.out.println("Brand found:"+toBeFound);
			}
		}
		
		for(int y=0;y<li.size()-1;y++) {
			if(li.get(y).brand.equals("Samsung")) {
				li.get(y).price=68000;
			}
		}
		System.out.println("After Price Update:");
		for(Mobile c:li) {
			c.displayDetails();
		}
		
		
		
	}
}
