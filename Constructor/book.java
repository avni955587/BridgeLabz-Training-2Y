package Constructor;


public class book {
	String title;
	String author;
	int price;
	
	public book() {
		title="Atomic Habits ";
		author = "H";
		price= 120;
	}
	public book(String title,String author,int price) {
		this.title =title;
		this.author= author;
		this.price= price;
	}
	public void display() {
		System.out.println("Book title : "+title);
		System.out.println("Book author : "+ author);
		System.out.println("Price of Book : "+price);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Defult Constructor");
		book defultconstructor = new book();
		defultconstructor.display();
		System.out.println();
		System.out.println("Perameterize Constructor");
		book peraconstructor = new book("avni", "mathura" , 3);
		peraconstructor.display();

		

	}

}