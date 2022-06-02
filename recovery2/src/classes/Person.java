package classes;

import interfaces.IPerson;

public class Person implements IPerson {

	private String name;
	private String personNumber;
	private int age;
	private int[] costReceipts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getCostReceipts() {
		return costReceipts;
	}

	public void setCostReceipts(int[] costReceipts) {
		this.costReceipts = costReceipts;
	}

	public Person(String name, String personNumber, int age, int[] costReceipts) {
		super();
		this.name = name;
		this.personNumber = personNumber;
		this.age = age;
		this.costReceipts = costReceipts;
	}

	public Person() {
	}

	public double calcAvgCosts() throws Exception {

		int sum = 0;

		if (this.costReceipts == null || this.costReceipts.length == 0) {
			throw new Exception();
		}

		for (int cost : this.costReceipts) {
			if(cost < 0 || cost > 200) {
				throw new Exception();
			}
			sum += cost;
		}
		return sum / this.costReceipts.length;
	}

}
