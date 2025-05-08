
import java.util.Scanner;


interface Shape{
    double area();
    default void printArea(double area){
        System.out.println("Area is: "+area());
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        double r  =sc.nextDouble();
        Shape circle = () -> Math.PI*r*r;
        circle.printArea(circle.area());

        System.out.println("Enter edge of Sqaure");
        double e  =sc.nextDouble();
        Shape square = () -> e*e;
        square.printArea(square.area());

        System.out.println("Enter sides of rectangle");
        double l  =sc.nextDouble();
        double b  =sc.nextDouble();

        Shape rectangle = () -> l*b;
        rectangle.printArea(rectangle.area());
    }
}
