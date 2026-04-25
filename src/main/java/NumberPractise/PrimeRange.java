package NumberPractise;

public class PrimeRange {
	public static void main(String[] args) {
		int min=10 , max=20,flag=0;
		for(int n=min;n<=max;n++) {
			for(int i=2;i<n;i++) {
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n);
			}
			flag=0;
		}
	}
}
