 public class Shape {
    static double areacircle(int radius) {
        return 3.14 * radius * radius;
    }

    static float areasqaure(float a) {
        return a * a;
    }

    static int arearect(int l, int b) {
        return l * b;
    }
}

public class Calculation {
    public static void main(String[] args) {
        System.out.println("Area of Circle: " + Shape.areacircle(30));
        System.out.println("Area of Square: " + Shape.areasqaure(30));
        System.out.println("Area of Rectangle: " + Shape.arearect(30, 25));
    }
}
