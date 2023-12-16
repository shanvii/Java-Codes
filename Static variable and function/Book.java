/* Satakshi Shanvi
23MCA10122 
Q2 java Mid term*/ 

public class Book {
    
    private String title;
    private String author;
    static int bookCount;

    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;

        bookCount++;
    }

    static int getBookCount() 
    {
        return bookCount;
    }

    public static void main(String[] args)
    {
        System.out.println();
        Book b1 = new Book("title1", "autho1");
        System.out.println("Title: " + b1.title + "Author: " + b1.author);
        System.out.println("Total Readers: " + Book.getBookCount());

        Book b2 = new Book("title2", "autho2");
        Book b3 = new Book("title3", "autho3");
        Book b4 = new Book("title4", "autho4");
        System.out.println("After 3 more object creation");
        System.out.println("Total Readers: " + Book.getBookCount());
    }
}
