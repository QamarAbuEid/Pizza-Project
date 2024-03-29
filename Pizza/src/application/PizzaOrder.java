package application;
import java.util.*;
public  class PizzaOrder implements Comparable<PizzaOrder>{

	private String customerName;
	private Date dateOrder;
	private int pizzaSize;
	final static int  SMALL=1, MEDIUM=2, LARGE=3;
	private int numberOfTopings;
	private double toppingPrice;
	
	public PizzaOrder() {
		
	}
	public PizzaOrder(String customerName, int pizzaSize, int numberOfTopings, double toppingPrice) {
		super();
		this.customerName = customerName;
		
		this.pizzaSize = pizzaSize;
		this.numberOfTopings = numberOfTopings;
		this.toppingPrice = toppingPrice;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		if(customerName != null) {
		this.customerName = customerName;
	}
	}
	public Date getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	public String getPizzaSize() {
		if(pizzaSize==1) {
		return "SMALL";
		}
		else if(pizzaSize==2 ) {
			return "MEDIUM";
		}
		else {
			return "LARGE";
		}
	}
	public void setPizzaSize(int pizzaSize) {
		if(pizzaSize >0) {
		this.pizzaSize = pizzaSize;
		}
	}
	public int getNumberOfTopings() {
		return numberOfTopings;
	}
	public void setNumberOfTopings(int numberOfTopings) {
		if(numberOfTopings>0) {
		this.numberOfTopings = numberOfTopings;
		}
	}
	public double getToppingPrice() {
		return toppingPrice;
	}
	public void setToppingPrice(double toppingPrice) {
		if(toppingPrice>0)
		{
		this.toppingPrice = toppingPrice;
	}
	}
	@Override
	public String toString() {
		return "\ncustomerName :" + customerName + ". \ndateOrder=" + dateOrder + ". \n pizzaSize: " + pizzaSize
				+ ". \n numberOfTopings=" + numberOfTopings + ". \ntoppingPrice=" + toppingPrice ;
	}
	
	//if i declared an abstract method in a class the class should be abstract
	
		public  double calculateOrderPrice() {
			return (numberOfTopings*toppingPrice)*pizzaSize;
		}
	public String printOrderInfo() {
		return "the customer name is :" + customerName+ "the  calculatOrdrePrice is :"+calculateOrderPrice();
	}
	
	@Override
	public int compareTo(PizzaOrder p) {
	    if (this.calculateOrderPrice() > p.calculateOrderPrice()) {
	        return 1;
	    } else if (this.calculateOrderPrice() < p.calculateOrderPrice()) {
	        return -1;
	    }
	    return 0;
	}

	
	
}
