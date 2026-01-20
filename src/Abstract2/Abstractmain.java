package Abstract2;

public class Abstractmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment p1=new CreditCardPayment();
		p1.makePayment(80);
		
		Payment p2=new UPIPayment();
		p2.makePayment(23);

	}

}
