

public class BookStore {
    String name;

    public BookStore(String name) {
        this.name = name;
    }

    Book books[] = new Book[10];

    void display() {
        for (int i = 0; i <books.length; i++) {
            if (books[i] == null) {
                break;
            }
            books[i].display();
        }
    }


    void sell(String name,String Author,String isbn ,int copy) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            }
            else if(name.equals(books[i].bookTitle) && Author.equals(books[i].bookAuthor)&&(isbn.equals(books[i].bookISBN))){
                books[i].numOfCopies-=copy;
            }
            else
                System.out.println("Not match");
            break;

            }
        }

    void order(String name,String Author,String isbn,int copy) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            }
            else if(name.equals(books[i].bookTitle) && Author.equals(books[i].bookAuthor)&&(isbn.equals(books[i].bookISBN))){
                books[i].numOfCopies+=copy;
            }
            else
                System.out.println("Not match");
            break;

        }
    }
}

