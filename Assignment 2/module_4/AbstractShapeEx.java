package module_4;


abstract class Shape {

 abstract void area();
}

class Circle extends Shape {
 double radius;

 
 Circle(double r) {
     radius = r;
 }


 void area() {
     double result = 3.14 * radius * radius;
     System.out.println("Area of Circle: " + result);
 }
}


class Rectangle extends Shape {
 double length, width;


 Rectangle(double l, double w) {
     length = l;
     width = w;
 }

 void area() {
     double result = length * width;
     System.out.println("Area of Rectangle: " + result);
 }
}


public class AbstractShapeEx {
 public static void main(String[] args) {
     Circle c = new Circle(5);
     Rectangle r = new Rectangle(4, 6);

     c.area();
     r.area();
 }
}