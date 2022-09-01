/*
 * Assumption the percentage in output has to be converted to integer,
 * if it has not decimal part (ie, whole number)
 */
import java.util.*;

class Train {
	int busno;
	String from;
	String to;
	int distance;
	char type;

	Train(int busno, String from, String to, int distance, char type) {
		this.busno = busno;
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.type = type;
	}

	Train(int busno, String from, String to, int distance) {
		this(busno, from, to, distance, 'O');
	}

	public int calcFare() {
		switch (this.type) {
			case 'O':
				return 10 * this.distance;
			case 'F':
				return 20 * this.distance;
			case 'L':
				return 24 * this.distance;
		}
		System.exit(1);
		return 0;
	}

	public void show() {
		System.out.println(this.busno + " " + this.from + " " + this.to + " " + this.distance + " " + this.type + " " + this.calcFare());
	}
}

public class Q8 {
	public static void main(String[] args) {
		List<Train> trains = new ArrayList<Train>();
		while (true) {
			switch(prompt()) {
				case 1:
					trains.add(readDetails());
					break;
				case 2:
					System.out.println("Bus Details (Busno,from,to,distance,type,fare)");
					for(Train train : trains) {
						train.show();
					}
					System.out.println("");
					break;
				case 3:
					System.exit(0);
					break;
				default:
					continue;
			}
		}
	}

	static byte prompt() {
		byte choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Add details");
		System.out.println("2-Show details");
		System.out.println("3-Exit");
		System.out.println("");
		System.out.print("Enter choice:");
		choice = Byte.parseByte(scanner.nextLine());
		return choice;
	}

	static Train readDetails() {
		Train train;
		String data;
		String[] dataArray;
		String[] validChars = {"O", "F", "L"};
		List<String> validTypes = Arrays.asList(validChars);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter bus details(Busno,from,to,distance,type)");
		data = scanner.nextLine();
		System.out.println("");
		dataArray = data.split("\\s");

		if (dataArray.length == 5) {
			if (dataArray[4].length() > 1 || validTypes.indexOf(dataArray[4]) == -1) {
				System.exit(1);
			}
			train = new Train(Integer.parseInt(dataArray[0]), dataArray[1], dataArray[2], Integer.parseInt(dataArray[3]), dataArray[4].charAt(0));
			return train;
		} else if (dataArray.length == 4) {
			train = new Train(Integer.parseInt(dataArray[0]), dataArray[1], dataArray[2], Integer.parseInt(dataArray[3]));
			return train;
		} else {
			System.exit(1);
		}

		return null;
	}
}
