package Abstract2;

public class CreditCardPayment extends Payment {

	@Override
	void makePayment(double amount) {
		System.out.println(amount+"amount using Credit Card");	
	}

	

}
