package Week7StringsAbstractionInterfacee;
abstract class Payment{
	int amount ;
	abstract void makePayment();
	void paymentDetails() {
		System.out.println("Payment amount is:"+amount);
	}
}

class CreditCardPayment extends Payment{
	void makePayment() {
		String cardNumber="1234";
		System.out.println("Paid " + amount + " using Credit Card ending with " + cardNumber);
	}
}

class UPIPayment  extends Payment{
	void makePayment() {
		String upiId="user@upi";
		System.out.println("Paid " + amount + " using UPI id:" + upiId);
	}
}

public class ECommercePaymentSystem {
	public static void main(String[] args) {
		Payment payment = new CreditCardPayment();
		payment.amount=5000;
		payment.paymentDetails();
		payment.makePayment();
		
		Payment payment1 = new UPIPayment();
		payment1.amount=1500;
		payment1.paymentDetails();
		payment1.makePayment();
		
	
	}
}
