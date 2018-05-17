/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg4;

/**
 * Test for the Shape class.
 * @author WahabEhsan
 */
public class Question4 {

    /**
     * Test for polymorphism of shape class.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Shape s1 = new Triangle(3, 5, "Green"); //traingle as shape
        System.out.println(s1);
        System.out.println("Area = " + s1.getArea());
        Shape s2 = new Rectangle(5, 6, "White"); //rectang;e as shape
        System.out.println(s2);
        System.out.println("Area = " + s2.getArea());
    }
    
}


abstract class Shape{ //Shape abstract class
    
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double getArea(); //abstract method for area

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + '}';
    }
    
    
    
}

class Triangle extends Shape{ //Extendtion of shape class.
    
    protected int base;
    protected int height;

    public Triangle(int base, int height, String color) {
        super(color);
        
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return (.5 * base * height); //the area of triangle
        
    }

    @Override
    public String toString() {
        return "Triangle{" + "color = " + super.color + ", base=" + base + ", height=" + height + '}';
    }
    
    
    
}
class Rectangle extends Shape{ //Extendtion of shape class.
    
    protected int base;
    protected int height;

    public Rectangle(int base, int height, String color) {
        super(color);
        
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return (base * height); //area of rectangle
        
    }

    @Override
    public String toString() {
        return "Recatangle{" + "color = " + super.color + ", base=" + base + ", height=" + height + '}';
    }
    
}