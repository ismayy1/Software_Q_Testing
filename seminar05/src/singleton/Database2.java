package singleton;

public class Database2 {
	
	private static Database2 INSTANCE = null;
	
	private Database2() {
		//
	}
	
	public static Database2 getInstance() {
		if(INSTANCE == null) {
			synchronized(Database2.class) {
				if((INSTANCE == null)) {
					INSTANCE = new Database2();					
				}
			}
		}
		return INSTANCE;
	}

}
