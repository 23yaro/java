public class Circle extends Shape {
    private Integer r;
    private final double p = 3.14;

    public Circle(Integer point_draw, Integer r) {
        super(point_draw);
        this.r = r;
    }

    @Override
    Double square() {
        return Math.pow(this.p * this.r, 2);
    }

    @Override
    Double perimeter() {
        return 2 * this.p * this.r;
    }
}
