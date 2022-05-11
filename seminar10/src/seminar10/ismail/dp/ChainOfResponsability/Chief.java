package seminar10.ismail.dp.ChainOfResponsability;

public class Chief extends AHandler {

	@Override
	public void processOrder(Order o) {
		// TODO Auto-generated method stub
		
		if(o.getDifficulty() >= 5) {
			System.out.println("The chief is handling: " + o.getName());
		} else {
			//throw exception
		}
		
	}

}
