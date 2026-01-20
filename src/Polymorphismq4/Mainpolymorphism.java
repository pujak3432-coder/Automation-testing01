package Polymorphismq4;

public class Mainpolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater c1=new Calculater();
		
		System.out.println("sum of two integer:"+c1.add(4, 5));
		System.out.println("Sum of doubles:"+c1.add(4.4, 4.6));
		System.out.println("Sum of three integers: "+c1.add(4, 4, 5));
		System.out.println("String concatenation: "+c1.add("puja"    ,  "kumari"));

	}

}
