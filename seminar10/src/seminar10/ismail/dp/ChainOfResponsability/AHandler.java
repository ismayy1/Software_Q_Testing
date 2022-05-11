package seminar10.ismail.dp.ChainOfResponsability;

public abstract class AHandler {
	
	protected AHandler nextPerson;
	
	public void setSuccessor(AHandler nextPerson) {
		this.nextPerson = nextPerson;
	}
	public abstract void processOrder(Order o);
	
}
