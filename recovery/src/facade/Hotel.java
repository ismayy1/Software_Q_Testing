package facade;

public class Hotel {

	// attributes
	private String name;

	// ctor
	public Hotel(String name) {
		super();
		this.name = name;
	}
	
	// method to book a room
	public void roomBooking(String location) {
		System.out.println("Hotel " + name + " in " + location);
	}
	
}
