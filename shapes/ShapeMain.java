package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String color = sc.next();
            String f = sc.next();
            boolean filled = f.equalsIgnoreCase("true");

            if (type.equalsIgnoreCase("RECTANGLE")) {

                double w = sc.nextDouble();
                double l = sc.nextDouble();

                shapes[i] = new Rectangle(color, filled, w, l);

            } else {

                double r = sc.nextDouble();

                shapes[i] = new Circle(color, filled, r);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(shapes[i]);
            if (i < n - 1) System.out.println();
        }

        System.out.println();
        System.out.println("--- Downcast Check ---");

        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());
            } else {
                Circle c = (Circle) s;
                System.out.println("Circle radius=" + c.getRadius());
            }
        }
        //Task -6:
        //Answer: The compiler will give Compile time error if I write: Shape s = new Shape("Red", true);
        // Since Shape is an abstract class therefore it can't be instantiated.

        sc.close();
    }
}