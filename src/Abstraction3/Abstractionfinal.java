package Abstraction3;

public class Abstractionfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ECommerce e1=new Amazon();
		e1.placeOrder("Mobile", 3);
		
		ECommerce e2=new Flipkart();
		e2.placeOrder("toy", 4);

	}

}
