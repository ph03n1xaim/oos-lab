import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int number;
        int length;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        length = (int)Math.log10(number)+1;
        System.out.println(length);
    }
}
