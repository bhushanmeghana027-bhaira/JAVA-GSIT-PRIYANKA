package April30;

import java.util.Stack;

public class ReverseStringStack {
	public static void main(String[] args) {
		String s = "Hello";
		char m[] = s.toCharArray();
		Stack<Character> s1 = new Stack<>();
		String temp="";
		for(char c:m) {
			s1.push(c);
		}
		int sizee =  s1.size();
		for(int i=0;i<sizee;i++) {
			temp = temp+s1.pop();
		}
		System.out.println(temp);
		
	}
}
