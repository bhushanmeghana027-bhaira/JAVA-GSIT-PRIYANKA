package Week6OOPs;

class Vehicle{
	String brand;
	double speed;
	static String company = "AutoWorld LTD";
	
	Vehicle(String brand,double speed){
		this.brand=brand;
		this.speed=speed;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	String getBrand() {
		return brand;
	}
	void run() {
		System.out.println("Vehicle is running");
	}
	static void displayCompany() {
		System.out.println(company);
	}
	final void engineType() {
		System.out.println("Standard engine");
	}
	void displayDetails() {
		System.out.println("Brand"+":"+this.brand);
		System.out.println("Speed"+":"+this.speed);
	}
}
class Car extends Vehicle{
	String fuelType;
	
	Car(String brand,double speed,String fuelType){
		super(brand,speed);
		this.fuelType=fuelType;
	}
	void run(){
		System.out.println("Car is running smoothly ");
	}
	void displayDetails() {
		System.out.println("Brand"+":"+this.brand);
		System.out.println("Speed"+":"+this.speed);
		System.out.println("FuelType:"+this.fuelType);
	}
	
//	void engineType() {
//		System.out.println("cannot override final method");
//	}
	
}
public class Question2 {
	public static void main(String[] args) {
//		question1
		Car c1 = new Car("Hyundai",120,"Petrol");
		c1.displayDetails();
//		question 2
		c1.run();
//		question3 
		c1.displayCompany();
//		question 4 
		c1.engineType();
		
//		question5
		c1.setBrand("Hyundai");
		c1.getBrand();
		String brandName = c1.getBrand();
		StringBuffer sb = new StringBuffer(brandName);
		System.out.println(sb.reverse());
		System.out.println(brandName.replace("y","*").replace("u","*").replace("a","*").replace("i","*"));
		System.out.println(brandName.equals("Hyundai"));
	}
	
}
