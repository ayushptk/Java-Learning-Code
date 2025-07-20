class Test {
    public int pub = 1;
    private int pri = 2;

    void show() {
        System.out.println("Private: " + pri);
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Public: " + t.pub);
        t.show();
    }
}
