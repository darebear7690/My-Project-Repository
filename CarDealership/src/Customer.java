import java.util.ArrayList;


//public static void main(String[] args);{
public class Customer {
	

	//as a customer I can view the cars on the lot
	
	//As a customer you can view cars on lot or in array list
		Customer() {
	ArrayList<String> carLot  = new ArrayList<String>();
	
	
	carLot.add("Audi");
	carLot.add("Chrysler");
	carLot.add("Toyota");
	
	StringBuilder carView = new StringBuilder();
	
	
	System.out.println(carLot);}
	
	
}

