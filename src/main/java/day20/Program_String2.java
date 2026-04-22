package day20;

public class Program_String2 {
	public static void main(String[] args) {
		String s = "today is a warm day";
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)== ' ') {
//				count++;
//			}
//		}
//		System.out.println("total no of words:"+ (count+1));
//	}
		String h[] = s.split(" ");
		for(String word:h) {
			
			System.out.println(word);
		}
		System.out.println(h.length);
		
	}

}
