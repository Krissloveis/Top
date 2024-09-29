package hw6;

public class Methods {
    // Метод для нахождения самых коротких и длинных строк
    public static String[] cornerValuesArray(String... strings) {
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

    // Метод для нахождения минимального и максимального значения в массиве int
    public static int[] cornerValuesArray(int... numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }

    // Метод для нахождения минимального и максимального символа в массиве char
    public static char[] cornerValuesArray(char... chars) {
        char min = chars[0];
        char max = chars[0];

        for (char c : chars) {
            if (c < min) {
                min = c;
            }
            if (c > max) {
                max = c;
            }
        }
        return new char[]{min, max};
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "kiwi", "watermelon"};
        String[] resultStr = cornerValuesArray(strings);
        System.out.println("Shortest: " + resultStr[0] + ", Longest: " + resultStr[1]);

        int[] numbers = {3, 5, 1, 8};
        int[] resultInt = cornerValuesArray(numbers);
        System.out.println("Min: " + resultInt[0] + ", Max: " + resultInt[1]);

        char[] chars = {'d', 'a', 'c', 'b'};
        char[] resultChar = cornerValuesArray(chars);
        System.out.println("Min: " + resultChar[0] + ", Max: " + resultChar[1]);
    }
}
