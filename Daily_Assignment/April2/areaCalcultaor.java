package April2;

public class areaCalcultaor {


		double area(double radius) {
			return Math.PI * radius * radius;
		}
		
		int  area(int length , int breadth) {
			return length*breadth;
		}
		
		int area(int side) {
	        return side * side;
	    }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaCalcultaor a1 = new areaCalcultaor();
		System.out.println(a1.area(5));
		areaCalcultaor a2 = new areaCalcultaor();
		System.out.println(a2.area(5,10));
		areaCalcultaor a3 = new areaCalcultaor();
		System.out.println(a3.area(5.0D));

	}

}
