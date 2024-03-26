public class Rectangle implements Shape {
    private Double initial_coordinate;
    private String color;
    private Double x;
    private Double y;
    private Double h;

    public Rectangle(Double x, Double y, Double h) {
        this.x = x;
        this.y = y;
        this.h = h;
        initial_coordinate = 0.0;
        color = "black";
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
    public void move(Integer x) {
        this.initial_coordinate += x;
    }

    @Override
    public void fill(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Double square() {
        return Math.abs(this.x - this.y) * this.h;
    }

    @Override
    public Double perimeter() {
        return Math.abs(this.x - this.y) * 2 + h * 2;
    }
}
