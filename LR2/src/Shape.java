abstract class Shape {

    private Integer point_draw;
    private String color;

    public Shape(Integer point_draw) {
        this.point_draw = point_draw;
        this.color = "black";
    }


    public void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    public void setPoint_draw(Integer point_draw) {
        this.point_draw = point_draw;
    }

    public Integer getPoint_draw() {
        return point_draw;
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


