package Practice;

public class Staticnonstatic {
	
	public static void addnumbers(int a,int b) {
		System.out.println("Sum:"+(a+b));
		System.out.println("multiply:"+(a*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addnumbers(9,9);//static
		addnumbers(8,0);//static
		Staticnonstatic p=new Staticnonstatic();
		p.addnumbers(9,9);
		p.addnumbers(8, 9);
		

	}

}
