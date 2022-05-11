package seminar10.ismail.dp.command;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chief ch1 = new Chief("John");
		Chief ch2 = new Chief("Maria");
		
		Waiter waiter = new Waiter();
		waiter.noteCommands(new PizzaOrder(ch1, "diavola"));
		waiter.noteCommands(new PizzaOrder(ch2, "carbonarra"));
		waiter.noteCommands(new PizzaOrder(ch1, "margerita"));
		
		waiter.sendCommands();

	}

}
