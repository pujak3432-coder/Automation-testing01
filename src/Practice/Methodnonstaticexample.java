package Practice;

public class Methodnonstaticexample {
	
	public void addNumbers(int a,int b) {
		int sum=a+b;
		System.out.println("sum="+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodnonstaticexample obj = new Methodnonstaticexample ();
        obj.addNumbers(10, 20);
	}

}
