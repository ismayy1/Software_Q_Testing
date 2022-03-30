package singleton;

public class Database {
	
	//attrb.
	//
	
	private static Database INSTANCE = null;
	static {
		try {
			INSTANCE = new Database(-1);		// early initialization
		} catch (Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Database(int smth) throws Exception {
		//
		if (smth<0) {
			throw new Exception();
		}
	}
	
	public static Database getInstance() {
		return INSTANCE;
	}

}
