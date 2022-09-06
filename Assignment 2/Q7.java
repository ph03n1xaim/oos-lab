/*
 * Assumption the percentage in output has to be converted to integer,
 * if it has not decimal part (ie, whole number)
 */
import java.util.*;

class Student {
    String rollNumber;
    String fullName;
    int height;
    int weight;

    public void readStudent() {
        Scanner scanner = new Scanner(System.in);
        String dataInput;
        String[] dataArray;
        dataInput = scanner.nextLine();
        dataArray = dataInput.split(",");

        if (data.length != 4 ) System.exit(1);

        for (int j = 0; j < dataArray.length; j++) {
            dataArray[j] = dataArray[j].trim();
        }

        this.rollNumber = dataArray[0];
        this.fullName = dataArray[1];
        this.height = Integer.parseInt(dataArray[2].toLowerCase().replace("cm", "").trim());
        this.weight = Integer.parseInt(dataArray[3].toLowerCase().replace("kg", "").trim());
    }

    public void printStudentDetails() {
        System.out.println(this.rollNumber + ", " + this.fullName + ", " + this.height + "cm, " + this.weight + "Kg");
    }


    public int getHeight() {
        return height;
    }

}

public class Q7 {
    public static void main(String[] args) {
        Student[] studentData;
        int totalStudents;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        totalStudents = Integer.parseInt(scanner.nextLine());
        studentData = new Student[totalStudents];

        System.out.println("Enter Student Details (rollNumber, fullName, height, weight)");
        for (int i = 0; i < totalStudents; i++) {
            studentData[i] = new Student();
            studentData[i].readStudent();
        }

        System.out.println("");

        sort(studentData);

        for(int i = 0; i < totalStudents; i++) {
            studentData[i].printStudentDetails();
        }

    }

    static void sort(Student[] array) {
        mergeSort(array, 0, (array.length - 1));
    }

    static void mergeSort(Student[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, (middle + 1), right);
            merge(array, left, middle, right);
        }
    }

    static void merge(Student[] array, int left, int middle, int right) {
        Student[] leftArray = Arrays.copyOfRange(array, left, (middle + 1));
        Student[] rightArray = Arrays.copyOfRange(array, (middle + 1), (right + 1));

        int leftIndex = 0;
        int rightIndex = 0;
        int currIndex = left;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex].getHeight() <= rightArray[rightIndex].getHeight()) {
                array[currIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[currIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currIndex++;
        }

        while (leftIndex < leftArray.length) {
            array[currIndex] = leftArray[leftIndex];
            currIndex++;
            leftIndex++;
        }

        while (rightIndex < rightArray.length) {
            array[currIndex] = rightArray[rightIndex];
            currIndex++;
            rightIndex++;
        }
    }
}
