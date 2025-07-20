public class StaticDemo {
    static int x = 100;

    public static void main(String[] args) {
        StaticDemo d1 = new StaticDemo();
        StaticDemo d2 = new StaticDemo();
        d1.x++;
        System.out.println("d2.x = " + d2.x);
    }
}
