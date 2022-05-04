package decorator;

public class PizzaBasic extends APizza {
	
	@Override
	public void getIngredients() {
		System.out.println("dough, ketchup, mozzarella");
	}

	@Override
	public void calculateCost() {
		System.out.println("price: 20 lei");
	}

}
