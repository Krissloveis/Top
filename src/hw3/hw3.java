package hw3;

public class hw3 {
    public static void main(String[] args) {

        String[] testStrings = {"голубика", "дыня", "Мандарин"};
        for (String str : testStrings) {
            int mid = str.length() / 2;
            String middle = str.substring(mid - 1, mid + 1);
            System.out.println("Средние символы '" + str + "': " + middle);
        }
    }
}

