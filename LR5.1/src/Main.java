import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("Pic1", "forest", 50, 100, 30));
        pictures.add(new Picture("Pic2", "sea", 20, 50, 200));
        pictures.add(new Picture("Pic3", "city", 150, 120, 80));
        pictures.add(new Picture("Pic4", "flowers", 200, 50, 100));
        pictures.add(new Picture("Pic5", "forest", 70, 120, 50));
        pictures.add(new Picture("Pic6", "sea", 30, 70, 180));
    }
}