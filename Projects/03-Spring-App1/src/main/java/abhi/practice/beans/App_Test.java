package abhi.practice.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		PaymentService ps = context.getBean(PaymentService.class);
		
		ps.doPayment(100.0);
	}  
}
