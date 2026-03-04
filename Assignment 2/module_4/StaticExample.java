package module_4;

class StaticDemo {

   
    static int count = 0;

    StaticDemo() {
        count++;
    }

  
    static void display() {
        System.out.println("No of objects created: " + count);
    }
}

public class StaticExample {
    public static void main(String[] args) {

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

     
        StaticDemo.display();
    }
}
