package seminar08;

public class DiscountA implements IDiscountA {
	
	@Override
	public double calculateDiscountA(int value) {
		System.out.println("meth A");
		if(value>100)
			return 0.1;
		if(value>=0 && value<=100)
			return 0.5;
		return 0;
	}

}
