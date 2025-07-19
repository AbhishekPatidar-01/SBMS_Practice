package abhi.practice;

public class DieselEngine implements IEngine{
	
	
	public DieselEngine() {
		System.out.println("Diesel Engine... ");
	}
	
	public int start() {
		System.out.println("Start Diesel Engine...");
		return 1;
	}

}
