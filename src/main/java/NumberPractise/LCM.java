package NumberPractise;

public class LCM {
	public static void main(String[] args) {
//		int a=9,b=12;
//		int lcm=1;
//		int n= Math.max(a,b);
//		for(int i=1;i<=n;i++) {
//			if(i%a==0 && i%b==0) {
//				lcm=i;
//				break;
//			}
//		}
//		System.out.println(lcm);
		int a = 9, b=12;
		int lcm =1;
		int num = Math.max(a, b);
		System.out.println(num);
		
		for(int i=num;;i++) {
			if(i%a==0 && i%b==0) {
				lcm =i;
				break;
			}
		}
		System.out.println("LCM is:"+lcm);
	}
}
