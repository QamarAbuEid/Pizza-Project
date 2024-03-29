package application;

import java.util.Date;

public class Seated extends PizzaOrder{
private double serviceCharge;
int numberOfPeople ;
public Seated() {
	
}

public Seated(String customerName,  int pizzaSize, int numberOfTopings, double toppingPrice,double serviceCharge, int numberOfPeople) {
	super(customerName,  pizzaSize, numberOfTopings, toppingPrice);
	this.serviceCharge = serviceCharge;
	this.numberOfPeople = numberOfPeople;
}

public double getServiceCharge() {
	return serviceCharge;
}

public void setServiceCharge(double serviceCharge) {
	this.serviceCharge = serviceCharge;
}

public int getNumberOfPeople() {
	return numberOfPeople;
}

public void setNumberOfPeople(int numberOfPeople) {
	this.numberOfPeople = numberOfPeople;
}

@Override
public String toString() {
	return "\nCustomerName: " + getCustomerName() + ". \n DateOrder : " + getDateOrder() + ". \n PizzaSize: "
			+ getPizzaSize() + ". \n NumberOfTopings: " + getNumberOfTopings() + ". \nToppingPrice: "
			+ getToppingPrice()+"\n=================================================================================";
}
@Override
public double  calculateOrderPrice(){
	return  super.calculateOrderPrice()+ ( serviceCharge * numberOfPeople ) ;
	
}

public void setServiceCharge1(double parseDouble) {
	// TODO Auto-generated method stub
	
}
}
