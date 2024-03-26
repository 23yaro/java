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
        if (!(o instanceof Rectangle o_compare)) {
            return false;
        }
        return Double.compare(x, o_compare.x) == 0 && Double.compare(y, o_compare.y) == 0 && Double.compare(h, o_compare.h) == 0;
    }

    @Override
    Double square() {
        return Math.abs(this.x - this.y) * this.h;
    }

    @Override
    Double perimeter() {
        return Math.abs(this.x - this.y) * 2 + h * 2;
    }

    @Override
    public String toString() {
        return " Площадь " + square() + " Периметр " + perimeter();
    }
}
