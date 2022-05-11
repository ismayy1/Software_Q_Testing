package seminar10.ismail.dp.state;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.setState(EState.AWAY);
		emp.processTask("server is down");

	}

}
