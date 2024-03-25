class Line extends Shape {
    private Double x;
    private Double y;

    public Line(Integer point_draw, Double x, Double y) {
        super(point_draw);
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    Double square() {
        return 0.0;
    }

    @Override
    Double perimeter() {
        return Math.abs(this.x - this.y);
    }


}
