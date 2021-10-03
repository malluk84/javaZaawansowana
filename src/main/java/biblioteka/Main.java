package biblioteka;

public class Main {
    public static void main(String[] args) {

        Author authorOne = new Author("Jan", "Brzechwa");
        Author authorTwo = new Author("Adam", "Mickiewicz");
        Copy copyOne = new Book(authorOne, "Bajki dla dzieci");
        Copy copyTwo = new Magazine(authorTwo, "Pan Tadeusz");
        Copy[] copies = new Copy[]{copyOne, copyTwo, copyOne, copyOne};
        Library library = new Library(copies);

       /* System.out.println(Arrays.toString(library.findByTitle("Pan")));
        System.out.println(Arrays.toString(library.findByAuthor(authorOne)));
        System.out.println(Arrays.toString(library.findByAuthor(authorTwo)));
*/

        System.out.println(library.findAuthorWithMostBooks());

    }
}
