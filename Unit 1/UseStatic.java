public class UseStatic {
    static int a = 10;
    static int b;

    static {
        b = a * 2;
        System.out.println("Static block");
    }

    static void show() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        UseStatic.show();
    }
}
