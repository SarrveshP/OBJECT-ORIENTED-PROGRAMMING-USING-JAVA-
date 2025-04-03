//Lab program 19 : 21 	Write a program to calculate the area of two different rectangle using class & objects.  
import java.util.Scanner;

class Rectangle {
    double length, width;

    // Constructor to initialize rectangle dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }
}

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for first rectangle
        System.out.print("Enter length of first rectangle: ");
        double length1 = sc.nextDouble();
        System.out.print("Enter width of first rectangle: ");
        double width1 = sc.nextDouble();

        // Taking input for second rectangle
        System.out.print("Enter length of second rectangle: ");
        double length2 = sc.nextDouble();
        System.out.print("Enter width of second rectangle: ");
        double width2 = sc.nextDouble();

        // Creating two Rectangle objects
        Rectangle rect1 = new Rectangle(length1, width1);
        Rectangle rect2 = new Rectangle(length2, width2);

        // Calculating and displaying areas
        System.out.println("\nArea of First Rectangle: " + rect1.calculateArea());
        System.out.println("Area of Second Rectangle: " + rect2.calculateArea());

        sc.close();
    }
}
