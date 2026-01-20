package Abstractionpractice;

public class MainECommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ECommerce e1=new Amazon();
		e1.placeOrder("Doll", 4);
		
		ECommerce e2=new Flipkart();
		e2.placeOrder("Toy car", 5);

	}

}
