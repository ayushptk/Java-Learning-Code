public class NestTry {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 1;
            int result = a / b; // This will cause ArithmeticException

            try {
                int[] arr = new int[3];
                arr[5] = 100; // This will cause ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds");
            }

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero");
        }
    }
}
