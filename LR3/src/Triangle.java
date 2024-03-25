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

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Triangle o_compare)) {
            return false;
        }
        return Double.compare(x, o_compare.x) == 0 && Double.compare(y, o_compare.y) == 0 && Double.compare(h, o_compare.h) == 0;
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
