package lectia14decembrie.autor;

public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Alan","asas@book.com",'m');
        System.out.println(anAuthor);
        anAuthor.setEmail("alan@rickman");
        System.out.println(anAuthor);
    }
}
