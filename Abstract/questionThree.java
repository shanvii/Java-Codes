abstract class qustionThree {

    String title;
    String author;

    public abstract void displayInfo();
}

class Book extends qustionThree {
    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public void displayInfo() {
        System.out.println("Info of Book here: Title- " + title + " ,Author: " + author);
    }
}

class DVD extends qustionThree {
    DVD(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public void displayInfo() {
        System.out.println("Info of DVD here: Title- " + title + " ,Author: " + author);
    }
}

class Magazine extends qustionThree {
    Magazine(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public void displayInfo() {
        System.out.println("Info of Magazine here: Title- " + title + " ,Author: " + author);
    }
}

public class questionThree {

    public static void main(String[] args)
    {
        System.out.println("\n");
        Book b = new Book("Book title", "Book author");
        b.displayInfo();
        DVD d = new DVD("DVD title", "DVD author");
        d.displayInfo();
        Magazine m = new Magazine("Magazine title", "Magazine author");
        m.displayInfo();
    }
}
