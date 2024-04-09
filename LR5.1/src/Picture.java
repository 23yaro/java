public class Picture {
    public Picture(String name, String theme, int r, int g, int b) {
        this.name = name;
        this.theme = theme;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    private String name;
    private String theme;
    private int r;
    private int g;
    private int b;


    public String getName() {
        return name;
    }

    public String getTheme() {
        return theme;
    }

    @Override
    public String toString() {
        return name + " - " + theme + " (" + r + ", " + g + ", " + b + ")";
    }
}