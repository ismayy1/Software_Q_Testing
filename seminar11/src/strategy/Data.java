package strategy;

public class Data {
	
	private int[] vector = null;
	private IStrategyFindSpecificNr strategy;
	
	public int[] getVector() {
		return vector;
	}
	
	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
	public IStrategyFindSpecificNr getStrategy() {
		return strategy;
	}
	
	public void setStrategy(IStrategyFindSpecificNr strategy) {
		this.strategy = strategy;
	}
	
	public Data(int[] vector, IStrategyFindSpecificNr strategy) {
		super();
		this.vector = vector;
		this.strategy = strategy;
	}
	
	public int processVector() {
		return this.strategy.process(vector);
	}

}
