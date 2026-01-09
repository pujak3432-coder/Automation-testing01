package MethodOverriding;

public class MethodOverridingm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b = new Icici();
		System.out.println("Rate of intrest:"+ b.getRateOfIntrest());
		
		b = new Rbi();
		System.out.println("Rate of intrest:"+ b.getRateOfIntrest());

		b = new Axis();
		System.out.println("Rate of intrest:"+ b.getRateOfIntrest());


	}

}
