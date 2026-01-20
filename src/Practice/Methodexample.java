package Practice;

public class Methodexample {
public static void addNumber(int a,int b,int c) {
	int sum=a+b+c;
	System.out.println("sum:"+sum);
}

public void subtract(int a,int b) {
	int sub =a-b;
	System.out.println("Diff : "+ sub);
}

	public static void main(String[] args) {
		addNumber(5,10,15); //caling the method
		Methodexample m=new Methodexample();
		m.subtract(10,5);

	}

}
