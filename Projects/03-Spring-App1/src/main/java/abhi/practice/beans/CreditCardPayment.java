package abhi.practice.beans;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		// TODO Auto-generated constructor stub
	}
	public boolean processPayment(double billAmt) {
		
		System.out.println("CreditCard Payment Processing...");
		return true;
	}
}
