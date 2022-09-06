import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    int salary;
    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}


class Manager extends Employee {
    int bonus;

    Manager(int id, String name, String department, int salary, int bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    public Integer getTotalSalary() {
        return this.salary + this.bonus;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.department + " " + this.salary + " " + this.bonus;
    }
}

public class Q4 {
    public static void main(String[] args) {
        List <Manager> managers = new ArrayList<>();
        Manager manager;
        int numManagers;
        int id;
        String name;
        String department;
        int salary;
        int bonus;
        String input;
        String[] dataRow;
        int highestSalary;

        Scanner scanner = new Scanner(System.in);

        numManagers = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numManagers; i++) {
            input = scanner.nextLine().trim();
            dataRow = input.split(" ");
            if (dataRow.length != 5)
                System.exit(1);
            id = Integer.parseInt(dataRow[0]);
            name = dataRow[1];
            department = dataRow[2];
            salary = Integer.parseInt(dataRow[3]);
            bonus = Integer.parseInt(dataRow[4]);
            manager = new Manager(id, name, department, salary, bonus);
            managers.add(manager);
        }
        Collections.sort(managers, (m1, m2) -> {
            return m2.getTotalSalary().compareTo(m1.getTotalSalary());
        });
        System.out.println("");

        highestSalary = managers.get(0).getTotalSalary();
        for (Manager m: managers) {
            if(m.getTotalSalary() == highestSalary) {
                System.out.println(m.toString());
            }
        }
    }
}
