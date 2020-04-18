//3. В каждой строке найти слова, начинающиеся с гласной буквы.
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<String>();
        char[] alphabet = "aeijouуеэоаыяию".toCharArray();

        System.out.println("Enter some strings ");
        String s = null;
        while (true) {
            s = scanner.nextLine();
            if (s.isEmpty())
                break;
            words.addAll(Arrays.asList(s.split("\\s+")));
        }

        for (int i=0; i<alphabet.length; i++) {
            for (String head : words) {
                if (head.charAt(0) == alphabet[i])
                    System.out.println("Слово, начинающееся с гласной: " + head);
            }
        }
        scanner.close();
    }
}