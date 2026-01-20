package Abstractionpractice;



public class Flipkart implements ECommerce {
	
	public void placeOrder(String item, int quantity) {
		System.out.println("Order placed on flipkart :" +item +" "+ quantity);
	}

}