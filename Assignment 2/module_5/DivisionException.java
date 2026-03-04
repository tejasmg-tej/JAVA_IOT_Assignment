package module_5;

public class DivisionException {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;  
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero not possible.");
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}