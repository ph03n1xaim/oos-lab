/*
 * Assumption the percentage in output has to be converted to integer,
 * if it has not decimal part (ie, whole number)
 */
import java.util.*;

class Student {
    String name;
    String rollNumber;
    byte cgpa;
    float percentage;

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public byte getCgpa() {
        return cgpa;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCgpa(byte cgpa) {
        this.cgpa = cgpa;
    }

    public void calculatePercentage() {
        this.percentage = this.cgpa * 9.5F;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Student[] studentData;
        int totalStudents;
        float currentPercentage;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        totalStudents = scanner.nextInt();
        studentData = new Student[totalStudents];

        System.out.println("Enter Student Details");
        for(int i = 0; i < totalStudents; i++) {
            studentData[i] = new Student();
            studentData[i].setName(scanner.next());
            studentData[i].setRollNumber(scanner.next());
            studentData[i].setCgpa(scanner.nextByte());
        }

        for(int i = 0; i < totalStudents; i++) {
            studentData[i].calculatePercentage();
            currentPercentage = studentData[i].getPercentage();
            if (currentPercentage == (int)currentPercentage) {
                System.out.println(studentData[i].getName() + " " + studentData[i].getRollNumber() + " " + studentData[i].getCgpa() + " " + (int)studentData[i].getPercentage() + " %");
            } else {
                System.out.println(studentData[i].getName() + " " + studentData[i].getRollNumber() + " " + studentData[i].getCgpa() + " " + studentData[i].getPercentage() + " %");
            }
        }
    }
}
