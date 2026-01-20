package Test2;

public class Car {
	String Make;
	String Model;
	int year;
	
	Car(String Make,String Model,int year){
		this.Make=Make;
		this.Model=Model;
		this.year=year;
	}

     void display() {
	System.out.println("Make:"+Make);
	System.out.println("model:"+Model);
	System.out.println("year:"+year);
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Suzuki", "i10", 1990);
		c1.display();
		
	}

}
