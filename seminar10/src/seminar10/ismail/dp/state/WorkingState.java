package seminar10.ismail.dp.state;

public class WorkingState implements IState {

	@Override
	public void act(String task) {
		// TODO Auto-generated method stub
		
		System.out.println("The employee works on handle: " + task);
		
	}

}
