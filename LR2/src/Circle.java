public class Circle extends Shape {


    private Integer r;
    private final double p = 3.14;


    public Circle(Integer point_draw, Integer r) {
        super(point_draw);
        this.r = r;
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
    Double square() {
        return Math.pow(this.p * this.r, 2);
    }

    @Override
    Double perimeter() {
        return 2 * this.p * this.r;
    }

    @Override
    public String toString() {
        return " Площадь " + square() + " Периметр " + perimeter();
    }
}
