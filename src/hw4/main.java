package hw4;

public class main {
    public static void main(String[] args) {
        String input =  "Шабаш";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Является ли строка палиндромом? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {

        String cleanedStr = str.replaceAll("\\\\", " ").toLowerCase();

        StringBuilder sb = new StringBuilder(cleanedStr);
        String reversedStr = sb.reverse().toString();


        return cleanedStr.equals(reversedStr);
    }
}

