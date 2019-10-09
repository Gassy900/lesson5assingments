package Lesson6;

public class Book {

    private String name, author;

    public Book(String x, String y) {
        name = x;
        author = y;
        
    }

    public String toString() {
        return ("Novel: " + name + "\t" + "Author: " + author);
    }

    public String getTitle(){
        return name;
    }
}
