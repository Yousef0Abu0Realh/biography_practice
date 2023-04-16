public class Book {

    Book(){

    }

    public Book(String bookName, String genre, int pages) {
        this.bookName = bookName;
        this.genre = genre;
        this.pages = pages;
    }

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
    Create a custom constructor that will take 3 args and defines the Book object
    Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE





    //Define instance variables here
    //YOUR CODE HERE

    public String bookName;
    public String genre;
    public int pages;





    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }
}
