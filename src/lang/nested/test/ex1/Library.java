package lang.nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount = 0;

    public Library(int count){
        this.books = new Book[count];
    }

    private class Book{
        private String title;
        private String author;

        Book(String title, String author){
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author){
        if(bookCount >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다.");
        }else{
            books[bookCount] = new Book(title, author);
            bookCount++;
        }
    }

    public void showBooks(){
        System.out.println("== 책 목록 출력==");
        for(Book book : books){
            System.out.println("도서 제목: " + book.title + ", 저자:" + book.author);
        }
    }
}
