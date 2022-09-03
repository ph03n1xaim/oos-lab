import java.util.*;
import com.studentdataextended.*;

public class Q6 {
	public static void main(String[] args) {
		List<StudentDataExtended> students = new ArrayList<>();
		StudentDataExtended student;

		StudentDataExtended.addDetails(students);
		StudentDataExtended.printDetails(students);
	}
}
