package Practice;

public class CalculaterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1= new Calculator();
		
		System.out.println("Sum of two integers:"+c1.add(5, 5));
		System.out.println("sum of two double values:"+c1.add(3.0, 1.0));
		System.out.println("sum of three integers:"+c1.add(3, 30, 103));
		System.out.println("Two string:"+c1.add("Software ", " testing"));

	}

}
