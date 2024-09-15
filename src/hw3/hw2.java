package hw3;

public class hw2 {
    public static void main(String[] args) {

        String str = "I like Java!!!";
        System.out.println("Last character: " + str.charAt(str.length() - 1));
        System.out.println("Ends with '!!!': " + str.endsWith("!!!"));
        System.out.println("Starts with 'I like': " + str.startsWith("I like"));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Position of 'Java': " + str.indexOf("Java"));
        System.out.println("Replacing 'a' with 'o': " + str.replace('a', 'o'));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}
