package seminar10.ismail.dp.command;

import java.util.ArrayList;

public class Waiter {
	
	private ArrayList<ICommand> commandList = new ArrayList<ICommand>();
	
	public void noteCommands(ICommand c) {
		commandList.add(c);
	}
	
	public void sendCommands() {
		for(ICommand c:commandList) {
			c.process();
		}
		commandList.clear();
	}

}
