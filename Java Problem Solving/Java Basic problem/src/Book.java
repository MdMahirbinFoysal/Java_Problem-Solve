public class Book {
    String bookTitle,bookAuthor,bookISBN;
    int numOfCopies;

    public Book(String bookTitle, String bookAuthor, String bookISBN, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.numOfCopies = numOfCopies;
    }
    void display(){
        System.out.println(bookTitle+" "+bookAuthor+" "+bookISBN+" "+numOfCopies);
    }

}
