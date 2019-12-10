package corejava;

public class BookMain {

	void createBooks(Book books[]){
		for(int i=0;i<books.length;i++)
			books[i]=new Book();
		books[0].setTitle("Java Prog");
		books[1].setTitle("Let us C");
		books[2].setTitle("HTML Beg.");
		books[0].setPrice(350);
		books[1].setPrice(200);
		books[2].setPrice(400);
		books[0].setAuthor("Ram");
		books[1].setAuthor("Shyam");
		books[2].setAuthor("Ghanshyam");
	}
	void showBooks(Book books[]){
		System.out.print(books[0].getTitle());
		System.out.print("\t"+books[0].getPrice());
		System.out.println("\t"+books[0].getAuthor());
		System.out.print(books[1].getTitle());
		System.out.print("\t"+books[1].getPrice());
		System.out.println("\t"+books[1].getAuthor());
		System.out.print(books[2].getTitle());
		System.out.print("\t"+books[2].getPrice());
		System.out.println("\t"+books[2].getAuthor());
	}

	public static void main(String[] args) {
		Book books[]=new Book[3];
		BookMain bm=new BookMain();
		bm.createBooks(books);
		bm.showBooks(books);
	}
}
