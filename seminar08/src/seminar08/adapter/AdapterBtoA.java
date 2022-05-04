package seminar08.adapter;

import seminar08.Client;
import seminar08.DiscountA;
import seminar08.IDiscountB;

public class AdapterBtoA extends DiscountA implements IDiscountB {
	
	@Override
	public double calculateDiscountB(Client client) {
		//v1:
//		this.calculateDiscountA(client.getNrOrders());
//		return 0;
		
		//v2:
		int total=0;
		for (int i=0; i<client.getNrOrders(); i++)
			total+=client.getOrders()[i];
		this.calculateDiscountA(total);
		return 0;
	}

}
