package Encapsulationpractice;

public class Maincaren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.setCarModel("Maruti");
		c1.setCarPrice(9876543);
		
		System.out.println("carmodel:"+c1.getCarModel());
		System.out.println("car price:"+c1.getCarPrice());

	}

}
