package Abstractionquestion4;

public class Car implements Vehicle, Fuel {
	
	public void start() {
        System.out.println("Car is starting with key ignition");
    }

    public void refuel(int liters) {
        System.out.println("Car refueled with " + liters + " liters");
    }
}



