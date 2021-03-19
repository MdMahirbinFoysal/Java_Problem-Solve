
public class Book {
	String title, authorName, isbn;
	int noOfCopies;
	
	public Book() {
		
	}

	public Book(String title, String authorName,String isbn, int noOfCopies) {
		//super();
		this.title = title;
		this.authorName = authorName;
		this.isbn = isbn;
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authorName=" + authorName +", isbn=" + isbn + ", noOfCopies=" + noOfCopies + "]";
	}
	
	public void display() {
		System.out.println(this);
	}
	
	
	

}





/////



import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	String name;
	ArrayList<Book> books = new ArrayList<>();
	
	public BookStore(String name) {
		super();
		this.name = name;
	}
	
	public void sell(String title, int quantity) {
		boolean found = false;
		for(int i=0; i<books.size(); i++) {
			Book b = books.get(i);
			if(b.title.equals(title)) {
				found = true;
				if(b.noOfCopies >= quantity) {
					b.noOfCopies -= quantity;
					System.out.println("Successfully Sold.");
				}
				else
					System.out.println("Not enough copy.");
				break;
			}
		}
		
		if(!found)
			System.out.println("The book is not available.");
	}
	

	public void order(String isbn, int quantity) {
		boolean found = false;
		for(int i=0; i<books.size(); i++) {
			Book b = books.get(i);
			if(b.isbn.equals(isbn)) {
				found = true;
				b.noOfCopies += quantity;
				break;
			}
		}
		
		if(!found) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the title and authorname of the book.");
			String title = scan.next();
			String au = scan.next();
			Book b1 = new Book(title, au, isbn, quantity);
			books.add(b1);
		}
	}
	
	
	public void display() {
		if(books.size()==0)
		{
			System.out.println("No books.");
			return;
		}
		for(int i=0; i<books.size(); i++) {
//			books.get(i).display();
			Book b = books.get(i);
			b.display();
		}
	}
}


////


import java.util.Scanner;

public class BookStoreApp {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		BookStore bs = new BookStore("Awesome B1");
		
		while(true) {
			int option = showMenu();
			
			switch(option) {
			case 1: // display
				bs.display();
				break;
			case 2: // sell
				System.out.println("Please enter the title and quantity.");
				String t = scan.next();
				int q = scan.nextInt();
				bs.sell(t, q);
				break;
			case 3: //order
				System.out.println("Please enter the isbn and quantity.");
				String isbn = scan.next();
				int quantity = scan.nextInt();
				bs.order(isbn, quantity);
				break;
			case 0:
				System.exit(0);
				//break;
			}
		}
		

	}
	
	public static int showMenu() {
		System.out.println("Please enter '1' to display\n'2' to sell\n'3' to order and\n'0' to exit.");
		int option = scan.nextInt();
		return option;
		
	}

}





