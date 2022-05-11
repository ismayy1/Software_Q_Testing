package seminar10.ismail.dp.ChainOfResponsability;

public class Waiter extends AHandler {

	@Override
	public void processOrder(Order o) {
		// TODO Auto-generated method stub
		
		if(o.getDifficulty() < 5) {
			System.out.println("The waiter is handling: " + o.getName());
		} else {
			System.out.println("The waiter can't handle: " + o.getName());
			this.nextPerson.processOrder(o);
		}
		
	}

}
