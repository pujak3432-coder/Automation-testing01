package Test2;


public class Counter {
	public static void multyplication(int a,int b) {
		//int multiply=a*b;
		System.out.println(a*b);
	}	 
		public void addNumber(int a,int b) {
			//int sum=a+b;
			System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNumber (8,9);//static
		Counter obj=new Counter();
		multyplication(8, 9);//non static

	}

}

