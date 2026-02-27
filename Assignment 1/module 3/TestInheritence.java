class Animal {
    void sound() {
        System.out.println("Dog sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.bark();
    }
}
