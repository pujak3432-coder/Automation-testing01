package Methodoverloading;

public class Test {

	public static void main(String[] args) {
		
		Mathoperation m1 = new Mathoperation();
        m1.add(5, 10);   //only intiger
        m1.add(5,10,15);  //
        
        Mathoperation1 m2=new Mathoperation1();
        m2.add(2, "Apple");
        m2.add("mango", 2);
        
        Mathoperation3 m3=new Mathoperation3();
        m3.add(2.5, 2.5);
        m3.add(5, 5);
        
        
        
    }
}


	


