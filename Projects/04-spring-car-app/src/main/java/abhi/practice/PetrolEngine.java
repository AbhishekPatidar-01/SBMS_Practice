package abhi.practice;

public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		System.out.println("Petrol Engine...");
	}
	
	public int start() {
		System.out.println("Start Petrol Engine.. ");
		return 1;
	}

}
