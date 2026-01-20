package Test4;

public class Amazon implements Ecommerce {
	
	public void placeOrder(String item, int quantity) {
		System.out.println("Order placed on Amazon:" +item +" "+ quantity);
	}

}