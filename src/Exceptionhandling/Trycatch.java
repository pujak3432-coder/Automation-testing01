package Exceptionhandling;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result =10/0;
			System.out.println("result");
		}catch (ArithmeticException e) {
			System.out.println("inavlid");
		}

	}

}
