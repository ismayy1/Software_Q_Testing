package facade;

public class Airline {

	// attributes
	private String name;

	// ctor w/ parameters
	public Airline(String name) {
		super();
		this.name = name;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// toString

	@Override
	public String toString() {
		return "Airline [name=" + name + "]";
	}
	
	
	// method to return a flight
	public Flight flightBooking(String initialLocation, String destination) {
		Flight flight = new Flight(initialLocation, destination, this);
		return flight;
	}
}
