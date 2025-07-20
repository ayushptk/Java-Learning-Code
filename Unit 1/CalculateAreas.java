public class CalculateAreas {
    void area(int r) {
        System.out.println("Circle area: " + 3.14 * r * r);
    }

    void area(int l, int b) {
        System.out.println("Rectangle area: " + l * b);
    }

    public static void main(String[] args) {
        CalculateAreas a = new CalculateAreas();
        a.area(5);
        a.area(4, 6);
    }
}
