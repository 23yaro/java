import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static List<String> scores = new ArrayList<>();

    public static void main(String[] args) {

        Names[] enumNames = Names.values();
        SubNames[] enumSubNames = SubNames.values();
        Random rand = new Random();

        ThreadClass[] threads = new ThreadClass[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ThreadClass(enumNames[rand.nextInt(enumNames.length)].toString() + " " + enumSubNames[rand.nextInt(enumSubNames.length)].toString());
            threads[i].start();
        }

        for (ThreadClass thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < scores.toArray().length; i++) {
            System.out.println(i + 1 + " МЕСТО: " + scores.get(i));
        }

    }

    static class ThreadClass extends Thread {
        ThreadClass(String name) {
            super(name);
        }

        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
            scores.add(Thread.currentThread().getName());
        }
    }

    public enum Names {
        ВЕЛИКАЯ, КРЕМЛЕВСКИЙ, ПРЕЗИДЕНТСКИЙ, КАЗЕННЫЙ,
        ВЕСЁЛЫЙ, ГРОМКИЙ, ДОБРЫЙ, ЗЛОЙ, ИНТЕРЕСНЫЙ, КРАСИВЫЙ, ЛОВКИЙ, МУДРЫЙ, НЕЖНЫЙ, ОПЫТНЫЙ,
        ПРИЯТНЫЙ, СИЛЬНЫЙ, СМЕЛЫЙ, СПОКОЙНЫЙ, ТАЛАНТЛИВЫЙ, УМНЫЙ, ЧЕСТНЫЙ, ШУТЛИВЫЙ, ЭНЕРГИЧНЫЙ,
        ЮМОРИСТИЧНЫЙ, ЯРКИЙ, АКТИВНЫЙ, БЕЗУПРЕЧНЫЙ, ВЕРНЫЙ, ВОЛЕВОЙ, ГАРМОНИЧНЫЙ, ДОБРОДУШНЫЙ, ЗАБОТЛИВЫЙ,
        ИСКРЕННИЙ, КОММУНИКАБЕЛЬНЫЙ, ЛАСКОВЫЙ, МУЗЫКАЛЬНЫЙ, НЕЗАВИСИМЫЙ, ОТВЕРГАТЕЛЬНЫЙ, ПРОФЕССИОНАЛЬНЫЙ, РАДОСТНЫЙ,
        СПРАВЕДЛИВЫЙ, ТВОРЧЕСКИЙ, УДИВИТЕЛЬНЫЙ, ФАНТАСТИЧЕСКИЙ, ХАРИЗМАТИЧНЫЙ, ЦЕЛЕСООБРАЗНЫЙ, ЧУВСТВЕННЫЙ, ШЕДРОСТИВЫЙ,
        ЭКСЦЕНТРИЧНЫЙ, ЮМОРИСТИЧНЫ, ЯРКИЕ,
    }

    public enum SubNames {
        СТИЛЬ, БАБУШКА, СОВЕСТЬ, ФЕДЕРАЦИЯ, ПРОКУРАТУРА, АВТОМОБИЛЬ, БАНАН, ВЕЛОСИПЕД, ГИТАРА, ДОМ, ЕЛКА, ЖУРНАЛ, ЗАМОК, ИГРУШКА, КИНОТЕАТР,
        ЛАМПА, МЯЧ, НОСКИ, ОКНО, ПИАНИНО, РУЧКА, СТОЛ, ТЕЛЕФОН, УЧЕБНИК, ФУТБОЛКА, УНИТАЗ,
        ХЛЕБ, ЦВЕТОК, ЧАСЫ, ШАПКА, ЭКРАН, ЯБЛОКО, АПЕЛЬСИН, БУМАГА, ВЕДРО, ГРУША,
        ДЕРЕВО, ЕЛЬ, ЖУК, ЗВОНОК, ИГРА, КОМПЬЮТЕР, ЛИСТ, МЫШЬ, НОЖКИ, ОРЕХ,
        ПАРК, РУЧКАВИЦА, СТУЛ, ТЕЛЕВИЗОР, УКРОП, ФИЛЬМ, ХОЛОДИЛЬНИК, ЦВЕТЫ, ШАРФ,
        ЭСКИМО, ЯЩИК, АВТОБУС, БУКВАРЬ, ВЕТЕР, ГОРШОК, ДЕДУШКА, ЖЕНЩИНА, ЗЕБРА, ИНСТРУМЕНТ,
        КАРТИНА, ЛУЧИК, МОЛОКО, НОГА, ОБЛАКО, ПЕЧЬ, РУБАШКА, СТУДЕНТ, ТЕПЛИЦА, УСМЕШКА,
        ФИЛЬТР, ХЛЕБУШЕК, ЦЕПОЧКА, ШТУЧКА, ЭЛЕФАНТ, ЯГОДА, чувство, лошадь, почва, интернет, вопрос, искусство, солдат, человек, немец,
    }
}