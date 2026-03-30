package WeekendClasses;

public class CountPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25147, count1=0;
		
		while(n!=0) {
			int digit = n%10;
			int count =0;
			for(int i=1;i<=digit;i++) {
				if(digit%i==0) {
					count++;
					
				}
				
				
			}
			if(count==2) {
				count1++;
			
			}
			n=n/10;
			
			
		}
		System.out.println(count1);
		

	}

}
