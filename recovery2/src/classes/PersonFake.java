package classes;

import interfaces.IPerson;

public class PersonFake implements IPerson {
	
	private String name;
	private String personNumber;
	private int age;
	private int[] costReceipts;
	
	public String getName() {
		return "ismail";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPersonNumber() {
		return "983498340945";
	}
	
	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}
	
	public int getAge() {
		return 18;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int[] getCostReceipts() {
		return costReceipts; //not a specific cost vector
	}
	
	public void setCostReceipts(int[] costReceipts) {
		this.costReceipts = costReceipts;
	}
	
	public PersonFake() {
		super();
		this.name = name;
		this.personNumber = personNumber;
		this.age = 18;
		this.costReceipts = costReceipts;
	}

	@Override
	public double calcAvgCosts() throws Exception {
		// TODO Auto-generated method stub
		
		Person p = new Person(this.getName(), this.getPersonNumber(), this.getAge(), this.costReceipts);
		
		
		return p.calcAvgCosts();
	}
	
	

}
