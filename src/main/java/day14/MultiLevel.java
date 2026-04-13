package day14;
class Parent{
	String house;
}
class Child extends Parent{
	String car;
}
class GrandChild extends Child{
	String bicycle;
}
public class MultiLevel {
	public static void main(String[] args) {
		GrandChild grandChild = new GrandChild();
		grandChild.house="3BHK";
		grandChild.car="Creats";
		grandChild.bicycle="Hero";
		
		System.out.println(grandChild.house+""+grandChild.car+" "+grandChild.bicycle);
	}

}
