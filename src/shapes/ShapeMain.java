import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ── TASK 1 ────────────────────────────────────────────
        // Read the number of shapes from input.
        int n = sc.nextInt();

        // ── TASK 2 ────────────────────────────────────────────
        // Declare a Shape array of size n.
        Shape[] shapes = new Shape[n];

        // ── TASK 3 ────────────────────────────────────────────
        // Loop n times. For each iteration:
        //   a) Read the shape type  (RECTANGLE or CIRCLE)
        //   b) Read color and filled on the same line
        //   c) Read dimensions (width + length OR radius)
        //   d) Create the correct object and store it in shapes[i]
        //      Use the Shape reference type for the array element.
        
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
        // Loop through the shapes array.
        // For each shape: print it (toString() is called automatically)
        // then print a blank line.
        // Loop through the shapes array and print.
        for (Shape s : shapes) {

            System.out.println(s);
            System.out.println();
        }

        // ── TASK 5 — Downcasting ---------
        // After printing all shapes, loop through the array again.
        // If the shape is a Rectangle, downcast it and print:
        //   "Rectangle width=" + width + " length=" + length
        // If the shape is a Circle, downcast it and print:
        //   "Circle radius=" + radius
        System.out.println("--- Downcast Check ---");

        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle width = "  + r.getWidth() + " length = " + r.getLength());
            } 

            else if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle radius=" + c.getRadius());

            }
        }

        // ── TASK 6 — Abstract class (written answer) ──────────
        // What error does the compiler give if you write:
        //     Shape s = new Shape("Red", true);
        //
        // Write your answer here as a comment:
        // ANSWER: "shape is abstract ,it cannot be instantiated ."

        sc.close();
    }
}// Enter code here
