public class Circle implements Shape {
    private Double initial_coordinate;
    private String color;
    private Integer r;
    private final double p = 3.14;


    public Circle(Integer point_draw, Integer r) {
        this.r = r;
        initial_coordinate = 0.0;
        color = "black";
    }


    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Circle o_compare)) {
            return false;
        }
        return Double.compare(r, o_compare.r) == 0;
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
    public String  getColor() {
        return this.color;
    }

    @Override
    public Double square() {
        return Math.pow(this.p * this.r, 2);
    }

    @Override
    public Double perimeter() {
        return 2 * this.p * this.r;
    }
}
