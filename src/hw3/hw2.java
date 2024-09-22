package hw3;

public class hw2 {
    public static void main(String[] args) {

        String str = "I love Watermelon!!!";
        System.out.println("Last character: " + str.charAt(str.length() - 1));
        System.out.println("Ends with '!!!': " + str.endsWith("!!!"));
        System.out.println("Starts with 'I love': " + str.startsWith("I love"));
        System.out.println("Contains 'Watermelon': " + str.contains("Watermelon"));
        System.out.println("Position of 'Watermelon': " + str.indexOf("Watermelon"));
        System.out.println("Replacing 'a' with 'o': " + str.replace('a', 'o'));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}
