public class Triangle extends Shape {
    private Double x;
    private Double y;
    private Double h;

    public Triangle(Integer point_draw, Double x, Double y, Double h) {
        super(point_draw);
        this.x = x;
        this.y = y;
        this.h = h;
    }

    @Override
    Double square() {
        return Math.abs(x - y) * h / 2;
    }

    @Override
    Double perimeter() {
        return Math.abs(x - y) * 3;
    }
}
