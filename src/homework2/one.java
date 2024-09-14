package homework2;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Вывод нечётных чисел от 1 до n

        System.out.print("Введите число n для задачи 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Нечётные числа от 1 до " + n1 + ": ");
        for (int i = 1; i <= n1; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
