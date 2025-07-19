package abhi.practice.beans;

public class PaymentService {
	
	private IPayment ip;
	
	
	public PaymentService() {
		System.out.println("PaymentService Constructor");
	}
	
	/*
	 * public PaymentService(IPayment ip) { this.ip = ip; }
	 */
	
	public void setIP(IPayment ip) {
		this.ip = ip;
	}
	
	public void doPayment(double billAmt) {
		
		boolean status = ip.processPayment(billAmt);
		
		if(status) {
			System.out.println("Payment Success");
		}
		else {
			System.out.println("Payment Failed.. ");
		}
		
	}
}
