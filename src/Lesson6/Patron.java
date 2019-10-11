package Lesson6;

public class Patron {

    private String name;
    private Book b1, b2, b3;

    public Patron(String x) {
        name = x;
        b1 = null;
        b2 = null;
        b3 = null;
    }

    public boolean borrow(Book b) {
        if (b1 == null) {
            b1 = b;
            return true;
        } else if (b2 == null) {
            b2 = b;
            return true;
        } else if (b3 == null) {
            b3 = b;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook(Book b) {
        if (b == b1) {
            b1 = null;
            return true;
        }
        if (b == b2) {
            b2 = null;
            return true;
        }
        if (b == b3) {
            b3 = null;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean hasBook(Book b) {
        if (b == b1) {
            return true;
        } else if (b == b2) {
            return true;
        } else if (b == b3) {
            return true;
        } else {
            return false;
        }

    }
}
