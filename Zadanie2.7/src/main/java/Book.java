public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title) {
        return Book.of(author, title);
    }
    public static void main(String[]args){
        Book book = Book.of("Isaac Asimov", "The Galaxy");

    }


}

