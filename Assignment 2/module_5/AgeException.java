package module_5;
import java.lang.*;
public class AgeException {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible.");
        } else {
            System.out.println("eligible.");
        }
    }

    public static void main(String[] args) {
    	try {
    		checkAge(16);
    	}catch(ArithmeticException e) {
    		System.out.println(e.getMessage());
    	}
    }
}
