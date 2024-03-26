class Line extends Shape {
    private Double x;
    private Double y;

    public Line(Integer point_draw, Double x, Double y) {
        super(point_draw);
        this.x = x;
        this.y = y;
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
    Double square() {
        return 0.0;
    }

    @Override
    Double perimeter() {
        return Math.abs(this.x - this.y);
    }

    @Override
    public String toString() {
        return " Площадь " + square() + " Периметр " + perimeter();
    }

}
