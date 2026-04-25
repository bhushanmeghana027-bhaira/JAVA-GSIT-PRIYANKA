package StringPractise;

public class Pallindrome {
	public static void main(String[] args) {
		String a = "madam";
		String ans , og = a,temp="";
		for(int i=0;i<a.length();i++) {
			temp = temp+a.charAt(i);
		}
		if(temp.equals(og)) {
			System.out.println("Pallin");
		}
		else
			System.out.println("nah palli");
	}

}
