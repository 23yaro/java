import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("Pic5", "forest", 50, 100, 30));
        pictures.add(new Picture("Pic2", "sea", 20, 50, 200));
        pictures.add(new Picture("Pic3", "city", 150, 120, 80));
        pictures.add(new Picture("Pic4", "flowers", 200, 50, 100));
        pictures.add(new Picture("Pic1", "forest", 70, 120, 50));
        pictures.add(new Picture("Pic6", "sea", 30, 70, 180));

        //1
        //Выполнить группировку картинок по темам
        System.out.println("Группировка по теме лес:");

        //Групируем по теме лес
        String groupThem = "forest";
        //Предикат
        Predicate<Picture> groupByThem = (Picture pic) -> Objects.equals(pic.getTheme(), groupThem);
        //Группировка по темам(предикат)
        List<Picture> groupedThem = pictures.stream()
                .filter(groupByThem)
                .toList();
        //Вывод
        groupedThem.forEach(System.out::println);

        //Выполнить сортировку по названиям
        System.out.println("Сортировка по названиям:");

        //Сортировка по названиям
        List<Picture> filteredAndSortedPictures = pictures.stream()
                .filter(groupByThem)
                .sorted(Comparator.comparing(Picture::getName))
                .toList();
        //Вывод
        filteredAndSortedPictures.forEach(System.out::println);

        //2
        //Найти отдельно картинки в каждой группе с максимальным и минимальным значением каждого цвета, выбор в указанном  (r,g,b)  диапазоне.



    }
}