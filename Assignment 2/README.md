# Assignment 2

## Question 1
Write a Java program to find the new length of a given sorted array after removing the occurrences more than twice from the duplicate elements.

#### Sample Input:
```
[1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
```

#### Sample Output:
```
The length of the original array is: 13
After removing duplicates, the new length of the array is: 10
```

## Question 2
Write a Java program that accepts a sentence, and print the number of words in the sentence and ASCII code of all the characters present in the sentence.

#### Sample Input:
```
JAVA ABC
Sample Output:
Words count is 2
‘J’  74
‘A’  65
‘V’  86
‘A’  65
‘ ‘ 32
‘A’ 65
‘B’ 66
‘C’ 67
```

## Question 3
Write a Java program that accepts a String, and remove all the duplicate characters from that String.

#### Sample Input 1:
```
JAVA
```

#### Sample Output 1:
```
JAV
```

#### Sample Input 2:
```
PROGRAMMING
```

#### Sample Output 2:
```
PROGAMIN
```

## Question 4
Write Java program for Maximum length Palindrome Substring of given String.

#### Sample Input 1:
```
BANANAS
```

#### Sample Output 1:
```
5
```

#### Sample Input 2:
```
ABC
```

#### Sample Output 2:
```
1
```

#### Sample Input 3:
```
AAA
```

#### Sample  Output 3:
```
3
```

## Question 5
Write a Java program to calculate the mess bill in a hostel. An inmate can be either a student or an employee. The per day mess rate  for vegetarians is 100 and for non vegetarian 120. An employee needs to pay 5% of the total price extra. Calculate the total mess bill with respect to
input details. Assume that the name of a student or employee has a single word. (All assumptions should be clearly specified in the submission)

#### Sample input and output
```
Enter the inmate details: Aiswarya employee veg
Enter the number of days: 20
2100

Enter the inmate details: Amrutha student veg
Enter the number of days: 20
2000

Enter the inmate details: Arathi employee nonveg
Enter the number of days: 30
3780

Enter the inmate details: Ruhina student  nonveg
Enter the number of days: 20
2400
```

## Question 6
Write a java program to display the student details (Name, RollNumber, CGPA and Percentage). Percentage should be converted from CGPA using member function. Input will be the total number of students followed by student details in the order of Name, RollNumber and CGPA(Assuming that the name of student has only one word, representing the first name). Output should be the details of all the students in the order Name, RollNumber, CGPA and percentage. Use  accessor (setter and getter) methods for accessing the attributes. (Percentage = 9.5*CGPA)

#### Sample input:
```
Enter number of students: 2
Enter Student Details
Aakash M180562CA 7
Naman M180507CA  8
```
#### Sample Output:
```
Aakash M180562CA 7 66.5 %
Naman M180507CA  8 76%
```

## Question 7
Write a Java program to sort (ascending order) the student data on the basis of their height (Make your own Student class with data members: rollNumber, fullName, height, weight and with member functions: readStudent, printStudentDetails).

_Hint: Make use of object array to hold the collection of students; Assume that the height values are unique for each student_

#### Sample Input:
```
Enter the number of students 5
Enter details  (rollNumber, fullName, height, weight) separated by comma in each line
B1610010, Aravind M, 160cm, 50Kg
B1610020, Anju Gupta, 150cm, 30Kg
B1610030, Jasmine Jacob, 155cm, 40Kg
B1610040, Mukund S, 159cm, 60Kg
B1610050, Veena V, 151cm, 40Kg
```

#### Sample Output:
```
B1610020, Anju Gupta, 150cm, 30Kg
B1610050, Veena V, 151cm, 40Kg
B1610030, Jasmine Jacob, 155cm, 40Kg
B1610040, Mukund S, 159cm, 60Kg
B1610010, Aravind M, 160cm, 50Kg
```

## Question 8
Define a class Train in java with the following specifications:

### Data Members
- busno - to store Bus Number
- from - to store Place name of origin (single word)
- to - to store Place name of destination (single word)
- distance - to store the Distance in Kilometres
- type – to store Bus Type such as ‘O’ for ordinary (O, F , L use enum).

### Member Functions
- A constructor function to initialize all data members. Use ‘O’ as type if nothing is specified
- A function CalcFare to calculate Fare as per the following criteria:

| Type  |      Fare     |
|-------|---------------|
|  'O'  | 10 * Distance |
|  'F'  | 20 * Distance |
|  'L'  | 24 * Distance |


- A function Show to display the content of all the data members on screen

#### Sample Input/Output:
```
1-Add details
2-Show details
3-Exit

Enter choice 1
Enter bus details(Busno,from,to,distance,type)
120 kannur calicut 500 F

1-Add details
2-Show bus details
3-Exit

Enter choice 1
Enter bus details(Busno,from,to,distance,type)
123 palayam mukkam 1400

1-Add details
2-Show details
3-Exit

Enter choice 2
Bus Details (Busno,from,to,distance,type, fare)
120 kannur calicut 500 F 10000
123 palayam mukkam 1400 O 14000

1-Add details
2-Show details
3-Exit

Enter choice 3
```

## Question 9
Write a java program to implement an inventory system for the video rental store. A video store consists of many videos. Each video consists of a title and a status of whether the video is rented out or not. There should be a method to track whether the video is rented or returned.
The video store will provide the facility to add a new video (by title) to the inventory, check out a video (by title), return a video to the store, and list the whole inventory of videos in the store. 
Create a main class VideoStoreLauncher  with a  method which will test the functionality. The videos can be added in bulk by specifying the number of videos first then followed by their titles.

#### Sample input and output
```
1.Add video
2.Check availability
3.Rent a video
4.Return
5.List the inventory
6.Exit

Choice:
1
N:
4
Titles:
The Shawshank Redemption
Godfather I
The Dark Knight
The Lady

Choice:
2
Title:
The Dark Knight
Available

Choice:
3
Title:
The Dark Knight

Choice:
2
Title:
The Dark Knight
NotAvailable

Choice:
5
"The Shawshank Redemption", "Godfather I", "The Lady"

Choice:
4
Title:
The Dark Knight

Choice:
2
Title:
The Dark Knight
Available

Choice:
6
```
