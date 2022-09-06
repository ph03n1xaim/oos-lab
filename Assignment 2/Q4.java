import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        String input;
        String substr;
        boolean isPalindrome = true;
        int longestLength = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                isPalindrome = true;
                substr = input.substring(i, j+1);
                for (int k = 0; k < substr.length() / 2; k++) {
                    if (substr.charAt(k) != substr.charAt(substr.length() - k - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome == true && longestLength < substr.length()) {
                    longestLength = substr.length();
                }
            }
        }
        System.out.println(longestLength);
    }
}
