package seminar10.ismail.dp.command;

public class Chief {
	
	private String name;
	
	public void cookPizza(String name) {
		System.out.println("Chief is cooking: " + this.name);
	}
	
	public void cookPasta(String name) {
		System.out.println("Chief is cooking: " + this.name);
	}

	public Chief(String name) {
		super();
		this.name = name;
	}
	
	

}
