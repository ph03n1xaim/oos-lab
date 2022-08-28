import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        int number;
        int reverse = 0;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for(int i = number; i > 0; i /= 10) {
            reverse = reverse * 10 + i % 10;
        }
        if (number == reverse)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
