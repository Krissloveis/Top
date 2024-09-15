package hw3;

public class hw {
    public static void main(String[] args) {

        String input = "Hello World 12345!";
        int lowerCaseCount = 0, upperCaseCount = 0;
        int digits0To4 = 0, digits5To9 = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) lowerCaseCount++;
                else upperCaseCount++;
            } else if (Character.isDigit(ch)) {
                if (ch >= '0' && ch <= '4') digits0To4++;
                else digits5To9++;
            }
        }
        System.out.println("Lowercase: " + lowerCaseCount + ", Uppercase: " + upperCaseCount);
        System.out.println("Digits 0-4: " + digits0To4 + ", Digits 5-9: " + digits5To9);
    }
}