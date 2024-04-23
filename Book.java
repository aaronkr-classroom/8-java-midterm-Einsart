public class Book {
    private String isbn;
    private String title;
    private String author;
    private int getYear;
    private boolean available;

    public Book(String isbn, String title, String author, int year, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.getYear = year;
        this.available = available;
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
        return getYear;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

/*Create a Book Interface and add the following function definitions.
Book 인터페이스를 만들고 다음 함수 정의를 추가하세요.

String getIsbn();
String getTitle();
String getAuthor();
int getYear();
boolean isAvailable();
void setAvailable(boolean available);
*/