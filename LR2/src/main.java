public class main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[14];
        shapes[0] = new Circle(0, 3);
        shapes[0].fill("blue");
        shapes[1] = new Rectangle(1, 4.0, 10.0, 5.0);
        shapes[1].fill("green");
        shapes[2] = new Line(2, 0.0, 4.0);
        shapes[2].fill("purple");
        shapes[3] = new Triangle(3, 2.0, 4.0, 5.0);
        shapes[3].fill("orange");
        shapes[4] = new Circle(0, 3);
        shapes[4].fill("red");
        shapes[5] = new Rectangle(1, 4.0, 10.0, 5.0);
        shapes[6] = new Line(2, 0.0, 4.0);
        shapes[7] = new Triangle(3, 2.0, 4.0, 5.0);
        shapes[7].fill("purple");
        shapes[8] = new Circle(0, 3);
        shapes[9] = new Rectangle(1, 4.0, 10.0, 5.0);
        shapes[10] = new Line(2, 0.0, 4.0);
        shapes[10].fill("orange");
        shapes[11] = new Triangle(3, 2.0, 4.0, 5.0);
        shapes[12] = new Circle(0, 3);
        shapes[13] = new Rectangle(1, 4.0, 10.0, 5.0);

        Shape shape1 = new Line(0,1.0,2.0);
        Shape shape2 = new Line(0,1.0,2.0);
        System.out.println(shape1.equals(shape2));


        print_all(shapes);
    }



    public static void print_all(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++){
            System.out.println("Square: " + shapes[i].square() + " Perimeter: " + shapes[i].perimeter() + " Color: " + shapes[i].getColor());
        }
    }
}