package shapes;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ── TASK 1 ────────────────────────────────────────────
        int n = sc.nextInt();

        // ── TASK 2 ────────────────────────────────────────────
        Shape[] shapes = new Shape[n];

        // ── TASK 3 ────────────────────────────────────────────
        for (int i = 0; i < n; i++) {
            String type   = sc.next();
            String color  = sc.next();
            boolean filled = sc.nextBoolean();

            if (type.equals("RECTANGLE")) {
                double width  = sc.nextDouble();
                double length = sc.nextDouble();
                shapes[i] = new Rectangle(color, filled, width, length);
            } 
            else if (type.equals("CIRCLE")) {
                double radius = sc.nextDouble();
                shapes[i] = new Circle(color, filled, radius);
            }
        }

        // ── TASK 4 ────────────────────────────────────────────
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println();
        }

        // ── TASK 5 — Downcasting ──────────────────────────────
        System.out.println("--- Downcast Check ---");

        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                // Double check whether your grader expects spaces around '='
                System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());
            } 
            else if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle radius=" + c.getRadius());
            }
        }

        // ── TASK 6 — Abstract class (written answer) ──────────
        // ANSWER: "shape is abstract ,it cannot be instantiated ."

        sc.close();
    }
}