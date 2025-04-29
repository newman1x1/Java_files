public class Finally_Ex {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // show error
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }finally{
            System.out.println("always happen");
        }
    }
}
