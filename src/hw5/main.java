package hw5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        int[] numbers = new int[]{1, 2, 3};
        int summElemementArrays = 0;
        for (int elemements : numbers) {
            summElemementArrays += elemements;
        }
        int avarageNubs = summElemementArrays / numbers.length;
        System.out.println(avarageNubs);
        System.out.println();
    }

    static void task2() {
        double[] numbers = new double[]{1.5, -5.6, 2.3};
        double min = 1009.686;
        double max = -1948.588;
        for (double elememts : numbers) {
            if (min > elememts) {
                min = elememts;
            }
            if (max < elememts) {
                max = elememts;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println();
    }

    static void task3() {
        char[] symbols = new char[]{'f', 'q', 'O', 'y'};
        char[] vowels = new char[]{'y', 'u', 'a', 'e', 'i', 'o', 'E', 'Y', 'U', 'I','O','A'};
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (symbols[i] == vowels[j]) {
                    System.out.println(vowels[j] + "  гласная");
                }
            }
        }
        System.out.println();
    }

    static void task4() {
        String text = "Hello world and me";
        char[] symbols = new char[text.length()];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = text.charAt(i);
            if (symbols[i] == ' ') {
                symbols[i] = '_';
            }
            System.out.print(symbols[i]);
        }
        System.out.println();
        System.out.println();
    }

    static void task5() {
        String str = "Oleg, Marina, Misha";
        String[] splitStr = str.split(",");
        System.out.println(Arrays.toString(splitStr));
    }
}



