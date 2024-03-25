abstract class Shape {
    private Integer point_draw;
    private String color;

    public Shape(Integer point_draw) {
        this.point_draw = point_draw;
        this.color = "black";
    }

//    @Override
//    public boolean equals(object o) {
//
//        // If the object is compared with itself then return true
//        if (o == this) {
//            return true;
//        }
//
//        /* Check if o is an instance of Complex or not
//          "null instanceof [type]" also returns false */
//        if (!(o instanceof Complex)) {
//            return false;
//        }
//
//        // typecast o to Complex so that we can compare data members
//        Complex c = (Complex) o;
//
//        // Compare the data members and return accordingly
//        return Double.compare(re, c.re) == 0
//                && Double.compare(im, c.im) == 0;
//    }



    public void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void move(Integer x) {
        this.point_draw += x;
    }

    void fill(String color) {
        this.color = color;
    }



    abstract Double square();

    abstract Double perimeter();
}


