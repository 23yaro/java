public class Rectangle extends Shape {
    private Double x;
    private Double y;
    private Double h;

    public Rectangle(Integer point_draw, Double x, Double y, Double h) {
        super(point_draw);
        this.x = x;
        this.y = y;
        this.h = h;
    }

    @Override
    Double square() {
        return Math.abs(this.x - this.y) * this.h;
    }

    @Override
    Double perimeter() {
        return Math.abs(this.x - this.y) * 2 + h * 2;
    }
}
