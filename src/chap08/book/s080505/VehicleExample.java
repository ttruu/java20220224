package chap08.book.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); // xxxxx
		
		// 강제타입변환
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}
