import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int number;
        int reverse = 0;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for(int i = number; i > 0; i /= 10) {
            reverse = reverse * 10 + i % 10;
        }
        System.out.println(reverse);
    }
}
