public class OverloadDemo {
    void show(int a) {
        System.out.println("int: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.show(10);
        obj.show("Hello Ayush Pathak");
    }
}
