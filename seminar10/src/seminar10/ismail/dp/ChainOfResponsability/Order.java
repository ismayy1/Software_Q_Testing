package seminar10.ismail.dp.ChainOfResponsability;

public class Order {
	
	private String name;
	private int difficulty;	// minutes
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public Order(String name, int difficulty) {
		super();
		this.name = name;
		this.difficulty = difficulty;
	}
	
}
