/*
 * Person class with a Teacher and Student subclass which has a subclass of college student.
 */
package question.pkg3;


/**
 * This tests the person class with the subclasses
 * @author WahabEhsan
 */
public class Question3 {

    /**
     * Test for question3.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);
        
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);
        
        Teacher mrJava = new Teacher("Duke Jave", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);
        
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18 , "F", "UCB123", 4.0, 1 ,"English");
        System.out.println(ima);
  
    }
    
    
}

class Person{//the supper class
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String myName, int myAge, String myGender) {
        this.myName = myName;
        this.myAge = myAge;
        this.myGender = myGender;
    }
    
    public String getName(){
        return this.myName;
    }

    public int getAge(){
        return this.myAge;
    } 
    
    public String getGender(){
        return this.myGender;
    } 
    
    public void setAge(int myAge){
        this.myAge = myAge;
    } 
    
    public void setName(String Name){
        this.myName = Name;
    }
    
    public void setGender(String Gender){
        this.myGender = Gender;
    }

    @Override
    public String toString() {
        return "Person{" + "myName=" + myName + ", myAge=" + myAge + ", myGender=" + myGender + '}';
    }
    
}

class Student extends Person{ //extention of person class
    
    protected String myIdNum;
    protected double myGPA;

    public Student(String myName, int myAge, String myGender, String myIdNum, double myGPA) {
        super(myName, myAge, myGender);
        
        this.myIdNum = myIdNum;
        this.myGPA = myGPA;
    }
    public String getIdNum(){
        return this.myIdNum;
    }
    
    public double getGPA(){
        return this.myGPA;
    }
    
    public void setIdNum(String id){
        this.myIdNum = id;
    }
    
    public void setGPA(double gpa){
        this.myGPA = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "Name = " + super.myName + ", Age =  " +
                super.myAge + ", Gender = " + super.myGender +
                " myIdNum=" + myIdNum + ", myGPA=" + myGPA + '}';
    }
    
    
    
}

class Teacher extends Person{ //extention of person class
    
    protected String subject;
    protected double salary;

    public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
        super(myName, myAge, myGender);
        
        this.subject = subject;
        this.salary = salary;
    }
    
    public String getSubject(){
        return this.subject;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public void setIdNum(String subject){
        this.subject = subject;
    }
    
    public void setGPA(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "Name = " + super.myName + ", Age =  " +
                super.myAge + ", Gender = " + super.myGender +
                ", subject=" + subject + ", salary=" + salary + '}';
    }
    
    
}

class CollegeStudent extends Student{ //extention of student class
    protected String major;
    protected int year;

    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year, String major) {
        super(myName, myAge, myGender, myIdNum, myGPA);
        
        this.major = major;
        this.year = year;
    }
    
     public int getYear(){
        return this.year;
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setMajor(String major){
        this.major = major;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" + "major=" + major + ", year=" + year +
                "name = " + super.getName() + "age=" + super.getAge() + 
                "gender=" + super.getGender() + "Id number=" + super.getIdNum() +
                "GPA=" + super.getGPA() + '}';
    }  
    
}

