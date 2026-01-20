package Abstractionquestion4;

public class Bike implements Vehicle,Fuel  {

	@Override
	public void refuel(int liters) {
		// TODO Auto-generated method stub
		System.out.println("Bike refueled with " +liters+ "liters+");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike is starting with self-start button");
	}
	

 }
