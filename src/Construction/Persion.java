package Construction;

class Persion {
	String name;
	int age;
	Persion(String n,int a){
		this.name=n;
		this.age=a;
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
	void greet() {
		System.out.println("hello,my name is" + name + "and i am " + age + " years old");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persion p1=new Persion("puja",32);
		p1.greet();
		

	}

}
