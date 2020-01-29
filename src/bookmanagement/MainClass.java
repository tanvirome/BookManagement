
package bookmanagement;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Book b1 = new Book("JAVA", "Writer", "154-45", "Engineering", 15);
        b1.showInfo();
        b1.addBookCopy(5);
        b1.showInfo();
        
        Book b2 = new Book("DATA", "Writer", "154-50", "Engineering", 20);
        b2.showInfo();
        b2.addBookCopy(5);
        b2.showInfo();
    }
    
}
