import java.util.ArrayList;
import java.util.List;

public class Author {


    Author(){

    }


    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE

    public Author(String authorsFirstName, String authorsLastName, String country, boolean isAlive, int age, List<Book> books) {
        this.authorsFirstName = authorsFirstName;
        this.authorsLastName = authorsLastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }




    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE

    public String authorsFirstName;
    public String authorsLastName;
    public String country;
    public boolean isAlive;
    public int age;
    public List<Book> books = new ArrayList<>();



    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        if(isAlive){return "Author{" +
                "authorsFirstName='" + authorsFirstName + '\'' +
                ", authorsLastName='" + authorsLastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", age=" + age +
                ", books=" + books +
                '}';}
        else {return "Author{" +
                "authorsFirstName='" + authorsFirstName + '\'' +
                ", authorsLastName='" + authorsLastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", books=" + books +
                '}';}
    }


}
