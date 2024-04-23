public class LibraryBook {
    private String isbn;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public LibraryBook(Book book) {
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.year = book.getYear();
        this.available = book.isAvailable();
    }

    public LibraryBook(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }
    
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

/*`LibraryBook.java`

Create a LibraryBook class that implements the Book interface. Add the following instance variables and methods. Book 인터페이스를 구현하는 LibraryBook 클래스를 만드세요. 다음 인스턴스 변수와 메소드를 추가하세요.
private String isbn;
private String title;
private String author;
private int year;
private boolean available;

public LibraryBook(Book book) {
    // 생성자
}

public LibraryBook(String isbn, String title, String author, int year) {
    // 생성자
}

@Override
public String getIsbn(); // return isbn
public String getTitle(); // return title
public String getAuthor(); // return author
public int getYear(); // return year
public boolean isAvailable(); // return available
public void setAvailable(boolean available);
*/