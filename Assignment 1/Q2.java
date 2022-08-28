import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        a = scanner.nextInt();
        System.out.print("b=");
        b = scanner.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
