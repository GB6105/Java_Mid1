package lang.nested.test.ex1;

public class Library {
    // private으로 선언
    private Book[] books;
    private int bookCount;

    public Library(int count){
        // 생성자에서는 굳이 this 안써줘도 됨
        books = new Book[count];
        // 여기서 0으로 초기화
        bookCount = 0;
    }

    //이 클래스 안에서 쓰지만 전혀 다른 객체임(인스턴스 공유 안함)
    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author){
        if(bookCount >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다.");
        }else{// else 문으로 꼭 감싸주어야함
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
