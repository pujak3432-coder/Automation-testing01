package Construction;

public class Book {
	String title;
	String author;
	double price;
	
	public Book(String title,String author,double price) {
		
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price"+price);
	}
	


	public static void main(String[] args) {
		Book b1=new Book("3 mistake","chetan bhagat",350);
		b1.displayDetails();

	}

}
