package seminar08;

import java.util.ArrayList;

public class Client {
	
	private String name;
	private int nrOrders;
	private int[] orders;
	
	public Client(String n, int no, int[] o) {
		this.name=n;
		this.nrOrders=no;
		this.orders=o;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNrOrders() {
		return nrOrders;
	}
	public void setNrOrders(int nrOrders) {
		this.nrOrders = nrOrders;
	}
	public int[] getOrders() {
		return orders;
	}
	public void setOrders(int[] orders) {
		this.orders = orders;
	}

}
