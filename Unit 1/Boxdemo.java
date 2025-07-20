class Box {
    double width, height, depth;
    double volume() {
        return width * height * depth;
    }
}

public class Boxdemo {
    public static void main(String[] args) {
        Box b = new Box();
        b.width = 2;
        b.height = 3;
        b.depth = 4;
        System.out.println("Volume: " + b.volume());
    }
}
