package seminar10.ismail.dp.state;

public class VacationState implements IState {

	@Override
	public void act(String task) {
		// TODO Auto-generated method stub
		
		System.out.println("The employee can't handle: " + task);
		
	}

}
