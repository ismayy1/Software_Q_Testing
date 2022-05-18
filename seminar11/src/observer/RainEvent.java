package observer;

public class RainEvent extends Observable {
	
	private String info;
	private boolean EvStarted = false;
	
	public void activateEvent() {
		if(this.EvStarted == false) {
			this.EvStarted = true;
			this.notifyAllHandler();
		}
	}
	
	public void publishEvent() {
		this.activateEvent();
	}

	public RainEvent(String info, boolean evStarted) {
		super();
		this.info = info;
		EvStarted = evStarted;
	}
	
	public RainEvent(String info) {
		super();
		this.info = info;
	}
	
	public RainEvent() {
		super();
	}

}
