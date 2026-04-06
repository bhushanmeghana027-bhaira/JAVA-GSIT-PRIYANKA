package Week3_Basics;

public class primer {
	public static void main(String[] args) 
	{int i;int n=60;
		for(i=2;i<=n;i++){
		    if(n%i==0){
		        int count=0;
		        for(int j=2;j<i;j++){
		            if(i%j==0)
		                count++;
		        }
		        if(count==0)  // no divisors found = prime!
		            System.out.println(i);
		        if(i>30)
		            break;
		    }
		}
		
	}
}
