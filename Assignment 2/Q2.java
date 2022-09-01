import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		String input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		System.out.println("Words count is " + input.split(" ").length);
		for (int i = 0; i < input.length(); i++) {
			System.out.println("'" + input.charAt(i) + "'" + " " + (int) input.charAt(i));
		}
	}
}
