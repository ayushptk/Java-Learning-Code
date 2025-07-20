class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Box b1 = new Box(2, 3, 4);
        Box b2 = new Box(5);
        System.out.println("Volume1: " + b1.volume());
        System.out.println("Volume2: " + b2.volume());
    }
}
