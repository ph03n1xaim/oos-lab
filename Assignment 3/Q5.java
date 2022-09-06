import java.util.*;

class Person {
    String personName;
    
    Person(String personName) {
        this.personName = personName;
    }
}

class Patient extends Person {
    String patientId;

    Patient(String personName, String patientId) {
        super(personName);
        this.patientId = patientId;
    }

    public Integer getAge(){
        return Integer.parseInt(this.patientId.split("-")[1]);
    }

    @Override
    public String toString() {
        return this.patientId + " " + this.personName;
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        Patient patient;
        Scanner scanner = new Scanner(System.in);
        int numPatients;
        String patientName;
        String patientId;
        // Input patient code goes here
        System.out.print("Enter the number of patients:");
        numPatients = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numPatients; i++) {
            System.out.println("\nEnter the details of patient " + i + ":");
            System.out.print("Name: ");
            patientName = scanner.nextLine().trim();
            System.out.print("Patient ID: ");
            patientId = scanner.nextLine().trim();
            patient = new Patient(patientName, patientId);
            patients.add(patient);
        }

        Collections.sort(patients, (p1, p2) -> {
            return p2.getAge().compareTo(p1.getAge());
        });

        System.out.println("\nList of Patients to be tested are:");

        for (Patient p: patients) {
            System.out.println(p.toString());
        }
    }
}
