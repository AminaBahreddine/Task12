public class EnumerationConstants{
    enum Shape {
        SQUARE(4, "Square"),
        RECTANGLE(4, "Rectangle"),
        CIRCLE(0, "Circle"),
        TRAPEZOID(4, "Trapezoid"),
        RHOMBUS(4, "Rhombus"),
        TRIANGLE(3, "Triangle"),
        OVAL(0, "Oval"),
        HEXAGON(6, "Hexagon");

        private final int sides;
        private final String name;

        Shape(int sides, String name) {
            this.sides = sides;
            this.name = name;
        }

        public int getSides() {
            return sides;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enumeration Constants:");
        for (Shape shape : Shape.values()) {
            System.out.println(shape.name() + " Sides: " + shape.getSides() + ", Name: " + shape.getName() + ", Ordinal: " + shape.ordinal());
        }
    }
}
