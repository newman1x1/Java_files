public class CombinedExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);

            int[] arr = { 1, 2, 3 };
            System.out.println(arr[6]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}
