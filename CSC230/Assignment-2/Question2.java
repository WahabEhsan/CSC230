/*
 * Extended version of question1 but with book class as well.
 */
package question.pkg1;

class Author {

    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author{" + "name = " + name + ", email = " + email + ", gender = " + gender + '}';
    }
    
    
}

/**
 * Test for the book class.
 * @author WahabEhsan
 */
public class Question2 {

    /**
     * Test for question2
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Case 1 :");
        Author sipser = new Author("Michael Sipser", "msipser@mit.edu", 'm');
        Book toc = new Book ("Theory of Computation", sipser, 200.00, 12);
        System.out.println(toc.getName());
        System.out.println(toc.getPrice());
        System.out.println(toc.getQtyInStock());
        toc.setPrice(150.00);//change the price
        System.out.println(toc.getPrice());
        toc.setQtyInStock(10);//change the stock
        System.out.println(toc.getQtyInStock());
        Author test = toc.getAuthor();
        System.out.println(test.getName());
        System.out.println(test.getGender());
        System.out.println(test.getEmail());
        
        System.out.println("Case 2 :"); //case 2 as requested in pdf
        Book toc2 = new Book ("Theory of Computation", new Author
        ("Michael Sipser", "msipser@mit.edu", 'm'), 200.00, 12);
        System.out.println(toc2.getName());
        System.out.println(toc2.getPrice());
        System.out.println(toc2.getQtyInStock());
        Author test2 = toc2.getAuthor();
        System.out.println(test2.getName());
        System.out.println(test2.getGender());
        System.out.println(test2.getEmail());
    }

}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    
    public String getName() {
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQtyInStock(){
        return this.qtyInStock;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString() {
        return "Book{" + "name = " + name + ", author = " + author.getName() +
                ", price = " + price + ", qtyInStock = " + qtyInStock +
                "Author email = " + author.getEmail() +
                ", Author's gender = " + author.getGender() + "}";
    }
    
    
}