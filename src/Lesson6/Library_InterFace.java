
package Lesson6;

public class Library_InterFace {

    public static void main(String[] args) {
        Book b1= new Book("Star Wars","Mitchell DeCarlo");
        Book b2= new Book("My Good Friend","Galany Dorris");
        Book b3= new Book("Hell Shores","Micheal Arnold");
        Book b4= new Book("Deep Cave","Marta Sellaroli");
        Book b5= new Book("Dark Voyager","Sterling Bern");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        
        Patron p = new Patron("Jonah Yarden");
        
        if(p.borrow(b1)) System.out.println(b1.getTitle()+ " Succesfully borrowed");
        else System.out.println(b1.getTitle()+" Could not be borrowed");
        
        if(p.borrow(b2)) System.out.println(b2.getTitle()+ " Succesfully borrowed");
        else System.out.println(b2.getTitle()+" Could not be borrowed");
        
        if(p.borrow(b3)) System.out.println(b3.getTitle()+ " Succesfully borrowed");
        else System.out.println(b3.getTitle()+" Could not be borrowed");
        
        if(p.borrow(b4)) System.out.println(b4.getTitle()+ " Succesfully borrowed");
        else System.out.println(b4.getTitle()+" Could not be borrowed");
        
        System.out.println("---------\n Atttemting to send first book back\n -----------------");
        if(p.returnBook(b1)) System.out.println(b1.getTitle()+" succesfully returned");
        else System.out.println(b1.getTitle()+" was not borrowed");
        System.out.println("------------------\n here is a list of the books "+p.getName()+" currently owns\n-----------------");
        if(p.hasBook(b1)) System.out.println(b1.getTitle());
        if(p.hasBook(b2)) System.out.println(b2.getTitle());
        if(p.hasBook(b3)) System.out.println(b3.getTitle());
        if(p.hasBook(b4)) System.out.println(b4.getTitle());
        if(p.hasBook(b5)) System.out.println(b5.getTitle());
        
        
        
        
    }
    
}
