package com.studentdataextended;

import java.util.*;
import com.studentdata.*;

public class StudentDataExtended extends StudentData {
	private String location;

	StudentDataExtended(String id, String name, String location) {
		super(id, name);
		this.location = location;
	}
	public String getLocation() {
		return this.location;
	}

	public static void addDetails(List<StudentDataExtended> students) {
		int numStudents;
		String[] dataRow;
		StudentDataExtended student;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of students: ");

		numStudents = Integer.parseInt(scanner.nextLine().trim());

		for(int i = 0; i < numStudents; i++) {
			System.out.println("Enter the details of Student " + (i + 1) + " (id, name, location):");
			dataRow = scanner.nextLine().trim().split("\\s");

			if (dataRow.length != 3)
				System.exit(1);

			student = new StudentDataExtended(dataRow[0], dataRow[1], dataRow[2]);
			students.add(student);
		}
	}

	public static void printDetails(List<StudentDataExtended> students) {
		Collections.sort(students, (s1, s2) -> {
			return s1.getId().compareTo(s2.getId());
		});

		System.out.println("The Student Details are:");

		for (StudentDataExtended student: students) {
			System.out.println(student.getId() + " " + student.getName() + " " + student.getLocation());
		}
	}
}
