public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
