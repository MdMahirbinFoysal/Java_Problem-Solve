import java.util.Scanner;

public class BookStoreApp {
    public static void main(String[] args) {

        BookStore bs = new BookStore("Foysal boiGhor");
        System.out.println(bs.name);
        bs.books[0] = new Book("java","H>S","2569",20);
        bs.display();
        Scanner scan=new Scanner(System.in);

        String name1=scan.nextLine();
        String Author= scan.nextLine();
        String isbn=scan.nextLine();
        int copy=scan.nextInt();
         bs.sell(name1,Author,isbn,copy);
         bs.display();

        String name2=scan.nextLine();
        String Author1= scan.nextLine();
        String isbn1=scan.nextLine();
        int copy1=scan.nextInt();

        bs.order(name2,Author1,isbn1,copy1);
        bs.display();

    }


    }

