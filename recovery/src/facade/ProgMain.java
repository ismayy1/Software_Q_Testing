package facade;

public class ProgMain {

	public static void main(String[] args) {
		// without facade
		Hotel hotel  = new Hotel("London Hilton");
		hotel.roomBooking("London");
		
		Airline airline = new Airline("BlueAir");
		Flight toGo = airline.flightBooking("Bucharest", "London");
		Flight back = airline.flightBooking("London", "Bucharest");
	}
}
