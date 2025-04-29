
public class Exception_Ex {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // show error
          //  int c = 2;//show result
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
