package hw1;

public class main {
    public static void main(String[] args) {
        String[] names = {"Диана", "Андрей", "Мария"};
        double[] salaries = {66660, 77770, 88880};
        double increaseRate = 0.15;

        for (int i = 0; i < names.length; i++) {
            double newSalary = salaries[i] * (1 + increaseRate);
            double annualIncomeGrowth = (newSalary * 12) - (salaries[i] * 12);
            System.out.printf("%s теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n", names[i], newSalary, annualIncomeGrowth);
        }
    }
}
