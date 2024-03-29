package application;

import java.util.Date;

public class Delivery extends PizzaOrder {
    private double tripRate;
    private int zone; 
    
    
    public Delivery() { 
    	
    }

    public Delivery(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double tripRate, int zone) {
        super(customerName, pizzaSize, numberOfToppings, toppingPrice);
        this.tripRate = tripRate;
        this.zone = zone;
    }

    public double getTripRate() {
        return tripRate;
    }

    public void setTripRate(double tripRate) {
        this.tripRate = tripRate;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        if (zone >= 1 && zone <= 4) {
            this.zone = zone;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    
    public double calculateOrderPrice() {
        return super.calculateOrderPrice() + ((tripRate / 100) * super.calculateOrderPrice() * zone);
    }
}
