import java.util.HashMap;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.next();
        System.out.println("Enter second string:");
        String str2 = sc.next();

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!charCountMap.containsKey(ch)) return false;
            charCountMap.put(ch, charCountMap.get(ch) - 1);
            if (charCountMap.get(ch) == 0) charCountMap.remove(ch);
        }
        return charCountMap.isEmpty();
    }
}
