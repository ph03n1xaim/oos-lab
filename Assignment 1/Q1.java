import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int number;
        int exponent;
        int power;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the number: ");
        number = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = scanner.nextInt();
        power = (int) Math.pow(number, exponent);
        System.out.println(power);
    }
}
