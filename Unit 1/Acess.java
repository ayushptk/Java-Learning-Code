public class Acess {
    public int x = 5;
    private int y = 10;

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Acess a = new Acess();
        System.out.println("x: " + a.x);
        System.out.println("y: " + a.getY());
    }
}
