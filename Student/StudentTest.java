/*
A Program where user enters 4 marks and add/remove the courses of his/her own choice. 
This program then returns the name of all the courses he/she is enrolled in and shows the passing marks. (where passedLimit is 50). 

A sample Student class.
Fields are name, A list of courses (string, fixed sized) // use array, A list of quiz marks in all subjects (float, variable sized). // use array
A static field is passLimit (how many marks are needed to pass the course).
A mulit-parameter constructor to initialize all the fields.
An instance method printInfo using the enhanced for loop to print all courses and quiz marks of
the student.
Test class: Create an array of student object with fixed number of courses and variable number
of quiz marks. The quiz marks are input from the user in a sentinel controlled loop until the user
enters a negative value. Print the student object info.
*Modify the program to store courses and quiz marks into ArrayList and then implement the
methods DropCourse and RegisterCourse receiving the courses name.
A method getPassedQuizzes, which returns the number of quizzes passed by the student
according to passLimit (use enhanced for loop for this).
*/


import java.util.Scanner;

public class StudentTest {
    public static void main(String[] arg) {

       double[] marks = new double[4];

        Student st1 = new Student("Anna",marks);

        Scanner in = new Scanner(System.in);


        System.out.println("Enter your marks: ");
        int i;

        for (i = 0; i < st1.quizMarks.length; i++)
        {
            st1.quizMarks[i] = in.nextDouble();
            marks = st1.quizMarks;
        }

        st1.RegCourse();
        st1.DropCourse();

        System.out.println("\n--------Displaying Student's Information--------\n");
        st1.printInfo();
        System.out.println("\nPassed: ");
        st1.getPassedQuizzes();
    }

}
