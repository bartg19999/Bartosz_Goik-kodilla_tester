public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title){
        Book book = new Book();
        return book;
    }
    public static void main(String[]args){
        Book.of("Isaac Asimov", "The Galaxy");
    }


}

