import java.util.*;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        String input;
        String output;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        Set<String> noDuplicates = new LinkedHashSet<>(Arrays.asList(input.split("")));
        output = String.join("", noDuplicates);
        System.out.println(output);
    }
}
