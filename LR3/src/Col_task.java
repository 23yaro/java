import java.util.HashMap;

public class Col_task {
    public static void main(String[] args) {
        String str = "HellO WOOrld";
        char targetChar = 'o';
        int count = countCharacters(str, Character.toUpperCase(targetChar));
        System.out.println(str);
        System.out.println("Количество букв '" + targetChar + "' в строке: " + count);
    }

    public static int countCharacters(String str, char targetChar) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Пройдемся по каждому символу в строке
        for (char c : str.toCharArray()) {
        // Если символ равен заданному символу, увеличим счетчик
            if (c == targetChar) {
        // Проверяем, есть ли символ уже в мапе
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }

        // Получаем количество заданных символов
        return charCountMap.getOrDefault(targetChar, 0);
    }
}