package hw6;

public class Methods {

    // Метод для вычисления квадрата числа

    public static int square(int number) {
        return number * number;
    }

    // Метод для вывода полного имени

    public static void printFullName(String firstName, String lastName) {
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    // Метод для нахождения самой короткой и самой длинной строки

    public static String[] cornerValuesArray(String[] strings) {

        String shortest = strings[0];
        String longest = strings[0];
        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return new String[]{shortest, longest};
    }
    public static void main(String[] args) {

        // Вызов метода square

        System.out.println(square(5)); // 25
        System.out.println(square(-3)); // 9

        // Вызов метода printFullName

        printFullName("Иван", "Иванов");
        printFullName("Мария", "Петрова");

        // Вызов метода cornerValuesArray

        String[] array = {"apple", "banana", "kiwi", "watermelon"};
        String[] result = cornerValuesArray(array);
        System.out.println("Shortest: " + result[0] + ", Longest: " + result[1]);

    }

}
