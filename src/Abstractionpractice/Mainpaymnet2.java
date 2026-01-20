package Abstractionpractice;

public class Mainpaymnet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment p1=new CreditCardPayment();
		p1.makePayment(9876);
		
		Payment p2=new UPIPayment();
		p2.makePayment(98765);
	}

}
