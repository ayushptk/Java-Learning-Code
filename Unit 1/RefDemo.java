public class RefDemo {
    int a;

    RefDemo(int i) {
        a = i;
    }

    public static void main(String[] args) {
        RefDemo r1 = new RefDemo(10);
        RefDemo r2 = r1;
        r2.a = 20;
        System.out.println(r1.a);
    }
}
