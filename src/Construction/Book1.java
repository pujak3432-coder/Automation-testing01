package Construction;

public class Book1 {
	String title;
	String author;
	int price;
	Book1(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price = price;
		
		void displayDetails() {
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Book1 b1 = new Book1("Mathematics", "Mr. Anand", 440);
		b1.displayDetails();

	}

}
