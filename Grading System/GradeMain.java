/*
3.Write a grading program for a class with the following grading policies:

a.There are three quizzes, each graded on the basis of 10 points.

b.There is one midterm exam, graded on the basis of 100 points.

c.There is one final exam, graded on the basis of 100 points.

The final exam counts for 40% of the grade. The midterm counts for 35% of the grade. 
The three quizzes together count for a total of 25% of the grade. (Do not forget to convert the quiz scores to percentages before they are averaged in.)

Any grade of 90 or more is an A, any grade of 80 or more (but less than 90) is a B, any grade of 70 or more (but less than 80) is a C, any grade of 60 or more (but less than 70) is a D, and any grade below 60 is an F. The program should read in the student’s scores and output the student’s record, which consists of three quiz scores and two exam scores, 
as well as the student’s overall numeric score for the entire course and final letter grade.
*/

import java.util.Scanner;

public class GradeMain {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        Grading s1 = new Grading();

        int students,q1,q2,q3, mid, fi;

        System.out.print("Enter number of students: ");
        students = scan.nextInt();

        for(int i = 1; i <= students; i++){

            System.out.printf("\nStudent %d: \n",i);
            System.out.print("Enter your number in quiz 1(out of 10): ");
            s1.setQ1(scan.nextInt());
            q1 = s1.getQ1();

            System.out.print("Enter your number in quiz 2(out of 10): ");
            s1.setQ2(scan.nextInt());
            q2 = s1.getQ2();

            System.out.print("Enter your number in quiz 3(out of 10): ");
            s1.setQ3(scan.nextInt());
            q3 = s1.getQ3();

            System.out.print("Enter your number in midterms(out of 100): ");
            s1.setMid(scan.nextInt());
            mid = s1.getMid();

            System.out.print("Enter your number in Final Exam (out of 100): ");
            s1.setFinalExam(scan.nextInt());
            fi = s1.getFinalExam();

            s1.computeQuiz();
            s1.computeFinal();
            s1.computeMid();
            s1.total();
            s1.Grade(s1.total());
            s1.display();
        }

    }
}
