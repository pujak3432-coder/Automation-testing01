package Practice;

public class Book {
	
	String title;
	String author;
	double price;
	
	Book(String t,String author,double price){
		title =t;
		this.author=author;
		this.price=price;
	}
	void dispalyDeatils() {
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
	}
	

	public static void main(String[] args) {
		
		Book b1=new Book("half girlfrind", "chetan bhagat",350.00);
		b1.dispalyDeatils();

	}

}
