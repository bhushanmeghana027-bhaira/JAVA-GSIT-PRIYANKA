
public class Day6_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =153;
		int og = num;
		int rem , cube, ans =0;
		while(num>0)
		{
			rem = num%10;
			cube = (int) Math.pow(rem, 3);
//			System.out.println(cube);
			ans = ans + cube;
			num = num/10;
		}
	if(ans==og) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not armstrong");
	}
	}

}
