package Abstraction3;

public class Amazon implements ECommerce {
	
	public void placeOrder(String item, int quantity) {
		System.out.println("Order placed on Amazon:" +item +" "+ quantity);
	}

}
