package homework2;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        // Задача 2: Произведение чисел от 1 до n

        System.out.print("Введите число n для задачи 2: ");
        Scanner scanner = new Scanner(System.in);
        int n2 = scanner.nextInt();
        int product = 1;
        for (int i = 1; i <= n2; i++) {
            product *= i;
        }
        System.out.println("Произведение чисел от 1 до " + n2 + " = " + product);
    }
}
