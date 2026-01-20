package Construction;

public class Car {
	String make;
	String model;
	int year;
	
	Car(String make, String model, int year) {
		this.make=make;
		this. model=model;
		this.year=year;
	
	}
	void display() {
		System.out.println("Make:"+make);
		System.out.println("model:"+model);
		System.out.println("year:"+year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Suzuki", "i10", 1990);
		c1.display();

	}

}
