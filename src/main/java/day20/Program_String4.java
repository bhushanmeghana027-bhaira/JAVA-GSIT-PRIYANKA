package day20;

public class Program_String4 {
public static void main(String[] args) {
	String s = "today is tuesday";
	String []r = s.split(" ");
	for(int i=1; i<r.length; i++){
	    r[i] = Character.toUpperCase(r[i].charAt(0)) + r[i].substring(1);
	}
	String result = String.join("", r);
	System.out.println(result);
	
}
}
