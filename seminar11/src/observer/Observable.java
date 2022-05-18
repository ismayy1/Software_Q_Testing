package observer;

import java.util.ArrayList;

public abstract class Observable {
	
	private ArrayList<IHandler> listObservable = new ArrayList<>();
	
	public void subscribeHandler(IHandler ihandler) {
		listObservable.add(ihandler);
	}
	
	public void unsubscribeHandler(IHandler ihandler) {
		listObservable.remove(ihandler);
	}
	
	public void notifyAllHandler() {
		//!!
		for(IHandler handler:listObservable) {
			
		}
	}

}
