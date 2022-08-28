import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n > 1) {
            int[] fib_array = new int[n];
            fib_array[0] = 0;
            if (n > 2) {
                fib_array[1] = 1;
                for (int i = 2; i < n; i++) {
                    fib_array[i] = fib_array[i - 1] + fib_array[i - 2];
                }
            }
            for (int i = 0; i < n; i ++) {
                System.out.print(fib_array[i] + " ");
            }
        }
    }
}
