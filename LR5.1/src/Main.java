import java.util.*;
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

        //диапазон
        List<Integer> red = new ArrayList<>(Arrays.asList(25, 150));
        List<Integer> green = new ArrayList<>(Arrays.asList(50, 255));
        List<Integer> blue = new ArrayList<>(Arrays.asList(0, 255));

        //группировка
        Predicate<Picture> groupByArea = (Picture pic) ->
                        pic.getR() > red.get(0) &&
                        pic.getG() > green.get(0) &&
                        pic.getB() > blue.get(0) &&
                        pic.getR() < red.get(1) &&
                        pic.getG() < green.get(1) &&
                        pic.getB() < blue.get(1);

        List<Picture> groupedByArea = pictures.stream()
                .filter(groupByArea)
                .toList();

        //Вывод
        System.out.println("Вывод в диапазоне:");
        groupedByArea.forEach(System.out::println);

        //Картинки с max значениями
        Picture groupedByMaxR = pictures.stream().reduce(((o1, o2) -> o1.getR() > o2.getR() ? o1 : o2)).get();
        Picture groupedByMaxG = pictures.stream().reduce(((o1, o2) -> o1.getG() > o2.getG() ? o1 : o2)).get();
        Picture groupedByMaxB = pictures.stream().reduce(((o1, o2) -> o1.getB() > o2.getB() ? o1 : o2)).get();

        //Картинки с min значениями
        Picture groupedByMinR = pictures.stream().reduce(((o1, o2) -> o1.getR() < o2.getR() ? o1 : o2)).get();
        Picture groupedByMinG = pictures.stream().reduce(((o1, o2) -> o1.getG() < o2.getG() ? o1 : o2)).get();
        Picture groupedByMinB = pictures.stream().reduce(((o1, o2) -> o1.getB() < o2.getB() ? o1 : o2)).get();

        System.out.println("Вывод максимальных и минимальных");
        System.out.println("MaxR " + groupedByMaxR);
        System.out.println("MaxG " + groupedByMaxG);
        System.out.println("MaxB " + groupedByMaxB);

        System.out.println("MinR " + groupedByMinR);
        System.out.println("MinG " + groupedByMinG);
        System.out.println("MinB " + groupedByMinB);

    }
}