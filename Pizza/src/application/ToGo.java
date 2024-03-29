package application;

import java.util.Date;

public class ToGo extends PizzaOrder{

	public ToGo() {
		super();
		
	}

	public ToGo(String customerName,  int pizzaSize, int numberOfTopings, double toppingPrice) {
		super(customerName,  pizzaSize, numberOfTopings, toppingPrice);
		
	}

	@Override
	public String toString()
	{
		return super.toString();
	}

}
