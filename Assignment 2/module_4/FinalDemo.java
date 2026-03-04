package module_4;

final class FinalClass {
 void display() {
     System.out.println("This is a final class.");
 }
}

class Parent {
 final int value = 10;


 final void show() {
     System.out.println("This is final method.");
     System.out.println("Final variable value: " + value);
 }
}


class Child extends Parent {
 void display() {
     System.out.println("Child class method.");
 }
 
}



public class FinalDemo {
 public static void main(String[] args) {
     Child c = new Child();
     c.show();
     c.display();

     FinalClass f = new FinalClass();
     f.display();
 }
}