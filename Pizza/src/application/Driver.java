package application;
import java.util.ArrayList;
import java.util.Date;

public class Driver {
public static void main(String[] args) {
	 ArrayList <PizzaOrder> orders=new ArrayList<>();
	 Delivery d1 = new Delivery("Qamar", 2, 3, 22.4, 5.2, 4);
	 Delivery d2 = new Delivery("Samia", 2, 3, 22.4, 5.2, 4);
	 ToGo t1=new ToGo("Bushara ",1,4,44.5);
	 Seated s1=new Seated("Yahia" ,3,2,3.5,22.5,8);
	 Seated s2=new Seated("Mariam" ,1,2,3.5,22.5,8);
	 orders.add(d1);
	 orders.add(d2);
	 orders.add(t1);
	 orders.add(s1);
	 orders.add(s2);
	 sort(orders);
	 calculateTotalOrdersPrice(orders);
	 System.out.println("the total ordered price is :" +calculateTotalOrdersPrice(orders));
	 
}
public static void sort(ArrayList <PizzaOrder> object) {
	int n;
	PizzaOrder temp;
	for(int i=0; i<object.size();i++) {
		for(int j=i+1;j<object.size();j++) {
			if (object.get(i) instanceof PizzaOrder && object.get(j) instanceof PizzaOrder) {
				n = ((PizzaOrder) object.get(i)).compareTo((PizzaOrder) object.get(j));// i ...this j...v
				if (n == -1) {
					temp = object.get(i);
					object.set(i, object.get(j)); // Put the value from index 2 into index 1
					object.set(j, temp);
				}
				
			}
		}
	}
	for (int i = 0; i < object.size(); i++) {
		System.out.println(object.get(i).toString());
	}
}
public static double  calculateTotalOrdersPrice(ArrayList <PizzaOrder> object) {
	int TotalOrdersPrice=0;
	for (int i = 0; i < object.size(); i++) {
		TotalOrdersPrice+=object.get(i).calculateOrderPrice();
	}
	return TotalOrdersPrice;
}
}
