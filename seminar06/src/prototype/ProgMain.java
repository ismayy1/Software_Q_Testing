package prototype;

public class ProgMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop carturesti = BookShop.loadDataFromDB("carturesti");
		
		System.out.println(carturesti);
		
		// Here we did a Shallow copy
//		System.out.println("Shallow copy");
//		BookShop diverta = carturesti;
		
		// Here we did a Deep copy
		System.out.println("Deep copy");
		BookShop.diverta = (BookShop) carturesti.clone();
		diverta.getBooks().remove(3);
		System.out.println(carturesti);
	}	

}
