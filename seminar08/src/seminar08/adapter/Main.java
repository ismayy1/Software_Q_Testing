package seminar08.adapter;

import seminar08.Client;
import seminar08.IDiscountA;
import seminar08.IDiscountB;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []v=new int[2];
		v[0]=100;
		v[1]=150;
		Client client=new Client("Larisa", 2, v);
		IDiscountB discount=new AdapterBtoA();
		discount.calculateDiscountB(client);
		//IDiscountA discount2=new AdapterBtoA();
		
	}

}
