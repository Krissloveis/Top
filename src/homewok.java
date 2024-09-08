import java.util.Scanner;

public class homewok {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите возраст человека: ");
                int age = scanner.nextInt();

                if (age >= 2 && age <= 6) {
                    System.out.println("Если возраст человека равен " + age + ", то ему следует ходить в детский сад.");
                } else if (age >= 7 && age <= 18) {
                    System.out.println("Если возраст человека равен " + age + ", то ему следует посещать школу.");
                } else if (age > 18 && age < 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему следует учиться в университете.");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему пора идти на работу.");
                }
            }
        }