package javabasics;

 class Car{
	 void brake(int i){
		 System.out.println("brake over clocking");
	 }
	void brake(){
		System.out.println("Car brake");
	}
}
 
 class PoliceCar extends Car{
	void brake(){
		System.out.println("PoliceCar brake");
	}
}
 class TaxiCar  extends Car {
	void brake(){
		System.out.println("TaxiCar brake");
	}
}
 class RaceCar  extends Car{
	 
	 
	 
	 public RaceCar(int i) {
		brake(i);
	}
	 void brake(int i){
		 System.out.println("brake over clocking");
	 }
	void brake(){
		System.out.println("RaceCar brake");
	}
}


public class DriverMan {

	public void brake(Car car) {
		car.brake();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		DriverMan pt= new  DriverMan();
		Thread.sleep(1000);
		PoliceCar pc = new PoliceCar();
		Thread.sleep(1000);
		RaceCar rc = new RaceCar(10);
		Thread.sleep(1000);
		TaxiCar tc= new TaxiCar();
		pt.brake(tc);
		pt.brake(pc);
		pt.brake(rc);
	}
	
	
}
