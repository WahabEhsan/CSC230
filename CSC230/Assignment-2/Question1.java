/*
 * Author class with getters and setters.
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
 * Test the Author class
 * 
 * @author WahabEhsan
 */
public class Question1 {

    /**
     * Test for question1
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Author sipser = new Author("Michael Sipser", "msipser@mit.edu", 'm');
        String email = sipser.getEmail();
        char gender = sipser.getGender();
        String name = sipser.getName();
        System.out.println(name + ", "+ gender +", " + email);
        System.out.println(sipser.toString());
        sipser.setEmail("msipser@uncg.edu");
        email = sipser.getEmail();
        System.out.println(email);
    }

}
