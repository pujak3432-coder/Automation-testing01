package Multipleinheritance;

public class Animal implements Cat,Dog {

	

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("bark");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep");
	}

}
