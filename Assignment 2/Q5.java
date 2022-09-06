import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        final double EXTRA_PERCENT = 1.0 + 5.0 / 100;
        String name;
        String personType;
        String foodType;
        int days;
        int amount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the inmate details: ");
        name = scanner.next();
        personType = scanner.next();
        foodType = scanner.next();
        System.out.print("Enter the number of days: ");
        days = scanner.nextInt();

        switch(foodType) {
            case "veg":
                amount = 100;
                break;
            case "nonveg":
                amount = 120;
                break;
            default:
                System.exit(1);
        }

        amount *= days;

        switch(personType) {
            case "student":
                break;
            case "employee":
                amount *= EXTRA_PERCENT;
                break;
            default:
                System.exit(1);
        }
        System.out.println(amount);
    }
}
