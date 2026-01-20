package Test4;


public class EcommerceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecommerce e1=new Amazon();
		e1.placeOrder("Headphone", 3);
		
		Ecommerce e2=new Flipkart();
		e2.placeOrder("Rangoli asset", 4); 

	}

}
