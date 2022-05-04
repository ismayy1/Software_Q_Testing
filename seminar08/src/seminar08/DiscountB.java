package seminar08;

public class DiscountB implements IDiscountB {
	
	@Override
	public double calculateDiscountB(Client client) {
		System.out.println("meth b");
		if(client.getNrOrders()>100)
			return 0.1;
		if(client.getNrOrders()>=0 && client.getNrOrders()<=100)
			return 0.5;

		int total=0;
		for(int i=0; i<client.getNrOrders(); i++)
			total+=client.getOrders()[i];
		if(total>1000)
			return 0.3;
		if(total>500 && total<=1000)
			return 0.2;
		return 0;

	}

}
