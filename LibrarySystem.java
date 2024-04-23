public class LibrarySystem {
	private Book[] booklist;
	private static int bookCount = 0;
	private static final int NUM_BOOK = 10;
	
	public LibrarySystem() {
		this.booklist = new Book[NUM_BOOK];
	}

	public void addBook(Book book) {
		if (bookCount < NUM_BOOK) {
			booklist[bookCount++] = book;
			System.out.println("책이 추가되었습니다!");
		} else {
			System.out.println("가득 차서 더 추가할 수 없습니다");
		}
	}

	public void removeBook(String title) {
		for (int i = 0; i < bookCount; i++) {
			if (booklist[i].getTitle().equals(title)) {
				for (int j = i; j < bookCount - 1; j++) {
					booklist[j] = booklist[j + 1];
				}
				booklist[--bookCount] = null;
				System.out.println("'" + title + "' 제거되었습니다.");
				return;
			}
		}
		System.out.println("Error: '" + title + "' 찾을 수 없습니다!");
	}

	public void borrowBook(String title) {
		for (int i = 0; i < bookCount; i++) {
			if (booklist[i].getTitle().equals(title)) {
				if (booklist[i].isAvailable()) {
					booklist[i].setAvailable(false);
					System.out.println("Book '" + title + "' 대여완료!");
				} else {
					System.out.println("Book '" + title + "' 대여 불가능한 도서입니다");
				}
				return;
			}
		}
		System.out.println("Error: '" + title + "' 찾을 수 없습니다!");
	}

	public void returnBook(String title) {
		for (int i = 0; i < bookCount; i++) {
			if (booklist[i].getTitle().equals(title)) {
				if (!booklist[i].isAvailable()) {
					booklist[i].setAvailable(true);
					System.out.println("Book '" + title + "' 반납이 완료되었습니다!");
				} else {
					System.out.println("Book '" + title + "'이미 반납돠ㅣ었습니다");
				}
				return;
			}
		}
		System.out.println("Error: '" + title + "' 찾을 수 없습니다!");
	}

	public void displayAllBooks() {
		if (bookCount == 0) {
			System.out.println("비었습니다.");
		} else {
			System.out.println("Book List:");
			for (int i = 0; i < bookCount; i++) {
				Book book = booklist[i];
				System.out.println(book.getIsbn() + " | " + book.getTitle() + " | " + book.getAuthor() + " | "
						+ book.getYear() + " | " + (book.isAvailable() ? "Available" : "Out"));
			}
		}
	}

	public static void main(String[] args) {
		LibrarySystem library = new LibrarySystem();
		
		// 책 추가
		Book book1 = new Book("ISBN1234", "JSP 웹 프로그래밍", "송미영", 2018, true);
		Book book2 = new Book("ISBN1235", "안드로이드 프로그래밍", "우재남", 2022, false);
		library.addBook(book1);
		library.addBook(book2);
		
		// 책 목록 출력
		library.displayAllBooks();
		
		// 책 대출
		library.borrowBook("안드로이드 프로그래밍");
		library.displayAllBooks();
		
		// 책 반납
		library.returnBook("안드로이드 프로그래밍");
		library.displayAllBooks();
		
		// 책 삭제
		library.removeBook("JSP 웹 프로그래밍");
		library.displayAllBooks();
	}
}
