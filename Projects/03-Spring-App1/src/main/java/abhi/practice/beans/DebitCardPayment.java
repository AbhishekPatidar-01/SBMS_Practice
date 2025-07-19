package abhi.practice.beans;

public class DebitCardPayment implements IPayment {
	
public DebitCardPayment() {
	// TODO Auto-generated constructor stub
}	
	public boolean processPayment(double billAmt) {
		System.out.println("Debit card Payment Processing.. ");
		return true;
		
	}

}
