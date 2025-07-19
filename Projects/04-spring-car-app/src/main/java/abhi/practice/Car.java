package abhi.practice;

public class Car {
	
	private IEngine petrol;
	
	public Car() {
		System.out.println("Contructor calling");
	}
	
	public Car(IEngine petrol) {
		this.petrol = petrol;
	}
	
//	public void setEngine(IEngine petrol) {
//		this.petrol = petrol;
//	}
//	
	public void driveCar() {
		int status = petrol.start();
		if(status > 0){
			System.out.println("Start engine.... ");
		}
		else {
			System.out.println("Engine Problem...");
		}
	}

}
