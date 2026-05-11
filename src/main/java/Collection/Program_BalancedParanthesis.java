package Collection;

import java.util.Stack;

public class Program_BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="[{]";
		int flag =0;
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{')
				st.push(str.charAt(i));
			else
			{
				if(st.empty()) {
					flag=1;
					break;
				}
				else {
					st.pop();
				}
			}
		}
		if(flag==1) {
			System.out.println("Not blanced more closing");
			
		}
		else if(!st.isEmpty())
		{
			System.out.println("Not balance:more oprning");
		}
		else
		{
			System.out.println("Balanced");
		}

	}

}
