
public class BookApp {

	

public static void main(String[] args) {
		
		Book b =new Book("JK Rowling", 45.00 ,400 ,"Harry Potter");//can be used only once
		//b.setAuthor("JK Rowling");
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
		System.out.println(b.getPageCount());
		System.out.println(b.getTitle());
		
		b.setPrice(48.80);
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
		System.out.println(b.getPageCount());
		System.out.println(b.getTitle());
		
		Book j =new Book("Tolkien" ,23.00 ,600 ,"Lord of the rings");
		System.out.println(j.getAuthor());
		System.out.println(j.getPrice());
		System.out.println(j.getPageCount());
		System.out.println(j.getTitle());

	}
}
