import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Book class
class Book {
    private String book_id;
    private String title;
    private String author;
    private String genre;
    private boolean is_checked_out;

    public Book(String book_id, String title, String author, String genre) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.is_checked_out = false;
    }

    public String getBookInfo() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre;
    }

    public void checkOut() {
        this.is_checked_out = true;
    }

    public void returnBook() {
        this.is_checked_out = false;
    }
}

// Member class
class Member {
    private String member_id;
    private String name;
    private String contact_info;
    private List<Book> checked_out_books;

    public Member(String member_id, String name, String contact_info) {
        this.member_id = member_id;
        this.name = name;
        this.contact_info = contact_info;
        this.checked_out_books = new ArrayList<>();
    }

    public boolean checkOutBook(Book book) {
        if (!book.is_checked_out) {
            book.checkOut();
            checked_out_books.add(book);
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook(Book book) {
        if (checked_out_books.contains(book)) {
            book.returnBook();
            checked_out_books.remove(book);
            return true;
        } else {
            return false;
        }
    }
}

// Transaction class
class Transaction {
    private String transaction_id;
    private Member member;
    private Book book;
    private Date due_date;

    public Transaction(String transaction_id, Member member, Book book, Date due_date) {
        this.transaction_id = transaction_id;
        this.member = member;
        this.book = book;
        this.due_date = due_date;
    }

    public int calculateFine() {
        // Assume a fine of $1 per day for overdue books
        long overdue_days = (new Date().getTime() - due_date.getTime()) / (1000 * 60 * 60 * 24);
        if (overdue_days > 0) {
            return (int) overdue_days;
        } else {
            return 0;
        }
    }
}

// Library class
class Library {
    private String name;
    private List<Book> books;
    private List<Member> members;
    private List<Transaction> transactions;
    private int transaction_counter;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.transaction_counter = 1;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Transaction checkOutBook(String member_id, String book_id) {
        Member member = findMemberById(member_id);
        Book book = findBookById(book_id);
        if (member != null && book != null) {
            if (member.checkOutBook(book)) {
                Date due_date = new Date(new Date().getTime() + (14 * 24 * 60 * 60 * 1000)); // 2 weeks from now
                Transaction transaction = new Transaction(Integer.toString(transaction_counter), member, book, due_date);
                transactions.add(transaction);
                transaction_counter++;
                return transaction;
            }
        }
        return null;
    }

    public Transaction returnBook(String transaction_id) {
        Transaction transaction = findTransactionById(transaction_id);
        if (transaction != null) {
            int fine = transaction.calculateFine();
            return transaction;
        }
        return null;
    }

    private Member findMemberById(String member_id) {
        for (Member member : members) {
            if (member.member_id.equals(member_id)) {
                return member;
            }
        }
        return null;
    }

    private Book findBookById(String book_id) {
        for (Book book : books) {
            if (book.book_id.equals(book_id)) {
                return book;
            }
        }
        return null;
    }

    private Transaction findTransactionById(String transaction_id) {
        for (Transaction transaction : transactions) {
            if (transaction.transaction_id.equals(transaction_id)) {
                return transaction;
            }
        }
        return null;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Library library = new Library("MyLibrary");

        Book book1 = new Book("B001", "Book1", "Author1", "Genre1");
        Book book2 = new Book("B002", "Book2", "Author2", "Genre2");

        Member member1 = new Member("M001", "Member1", "Contact1");
        Member member2 = new Member("M002", "Member2", "Contact2");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        library.checkOutBook("M001", "B001");
        Transaction returnedTransaction = library.returnBook("1");
        if (returnedTransaction != null) {
            System.out.println("Fine for returned book: $" + returnedTransaction.calculateFine());
        }
    }
}
