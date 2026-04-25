package April24;

interface Payment {
	void pay(double amount);
}

class CreditCardPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Paid " +amount+ "using Credit Card");
	}
}

class UPIPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Paid "+amount+" using UPI");
	}
}
public class PayInterface {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		p1.pay(500);

		Payment p2 = new UPIPayment();
		p2.pay(1000);
	}
}
