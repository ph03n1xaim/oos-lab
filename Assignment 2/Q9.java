/*
 * Assumption the percentage in output has to be converted to integer,
 * if it has not decimal part (ie, whole number)
 */
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        int numVideos;
        String title;
        String output = "";
        LinkedHashMap<String, Boolean> inventory = new LinkedHashMap<String,Boolean>();
        Scanner scanner = new Scanner(System.in);
        info();
        while(true) {
            switch(prompt()) {
                case 1:
                    System.out.println("N:");
                    numVideos = Integer.parseInt(scanner.nextLine());
                    System.out.println("Titles:");
                    for (int i = 0; i < numVideos; i++) {
                        title = scanner.nextLine().trim();
                        inventory.put(title, true);
                    }
                    break;
                case 2:
                    System.out.println("Title:");
                    title = scanner.nextLine();
                    if (inventory.get(title) == true) System.out.println("Available");
                    else System.out.println("NotAvailable");
                    break;
                case 3:
                    System.out.println("Title:");
                    title = scanner.nextLine();
                    if (inventory.containsKey(title) == true) inventory.put(title, false);
                    break;
                case 4:
                    System.out.println("Title:");
                    title = scanner.nextLine();
                    if (inventory.containsKey(title) == true) inventory.put(title, true);
                    break;
                case 5:
                    for (String titleKey: inventory.keySet()) {
                        if(inventory.get(titleKey) == true) {
                            output += "\"" + titleKey + "\", ";
                        }
                    }

                    output = output.replaceAll("\\,\\s$", "");

                    System.out.println(output);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    static void info() {
        System.out.println("1.Add video");
        System.out.println("2.Check availability");
        System.out.println("3.Rent a video");
        System.out.println("4.Return");
        System.out.println("5.List the inventory");
        System.out.println("6.Exit");
    }

    static byte prompt() {
        byte choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoice:");
        choice = Byte.parseByte(scanner.nextLine());
        return choice;
    }

}
