package Practice;

public class Mathoperationsexample {
	public static void multiplyNumbers(int a,int b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplyNumbers(6,9);//static method
		Mathoperationsexample obj=new Mathoperationsexample();
	    obj.multiplyNumbers (8,9);//non static

	}

}
