
public class Dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345,pos=1,ans=0, rev =0;
		while(n>0) {
			int dig = n%10;
//			System.out.println(pos +":"+dig);
			if(pos%2!=0 ) {
				if(dig <=4) {
					ans = (ans*10) + dig*2;
				}
				else
				{
					ans = (ans*10) + dig;
				}
				 
			}
			else {
				dig =1;
				ans = (ans*10) + dig;
			}
			pos++;
			n = n/10;
			
			
		}
		System.out.println(ans);
		while(ans>0) {
			int re = ans%10;
			rev = (rev*10)+re;
			ans = ans/10;
		}
		System.out.println(rev);

	}

}
