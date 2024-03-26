public class Line implements Shape {
    private Double initial_coordinate;
    private String color;
    private Double x;
    private Double y;

    public Line(Double x, Double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Line o_compare)) {
            return false;
        }
        return Double.compare(x, o_compare.x) == 0 && Double.compare(y, o_compare.y) == 0;
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
    public Double square() {
        return 0.0;
    }

    @Override
    public Double perimeter() {
        return Math.abs(this.x - this.y);
    }

    @Override
    public String getColor() {
        return this.color;
    }

}
