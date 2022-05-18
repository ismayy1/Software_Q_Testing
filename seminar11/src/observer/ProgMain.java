package observer;

import java.awt.Event;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RainEvent rain = new RainEvent("rain");
		
		IHandler you = new YouHandler();
		IHandler she = new SheHandler();
		IHandler andreea = new AndreaHandler();
		
		rain.subscribeHandler(you);
		rain.subscribeHandler(she);
		rain.subscribeHandler(andreea);
		
		rain.activateEvent();

	}

}
