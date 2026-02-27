public class Shapeprint {
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
   
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}


    public static void main(String[] args) {
        
        
        Shape s=new Circle();
        s.draw();
        
        Shape s=new Rectangle();
        s.draw();
    }
}
