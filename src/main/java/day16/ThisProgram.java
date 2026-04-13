package day16;
class UserG{
	int id;
	String name;
	
	UserG(){
		System.out.println("Construnctor1 is called");
	}
	
	UserG(int id , String name){
		this();
		this.id = id ;
		this.name = name;
		System.out.println("Construnctor 2 is called");
	}
	void print() {
		System.out.println(this.id+":"+this.name);
	}
}
public class ThisProgram {
	 public static void main(String[] args) {
		UserG userG = new UserG(101,"Rajat");
		userG.print();
	}
}
