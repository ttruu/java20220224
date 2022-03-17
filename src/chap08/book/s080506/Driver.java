package chap08.book.s080506;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
		
	}
}
