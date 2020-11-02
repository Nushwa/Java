import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    String[] Courses = {"English", "Computer Science", "Physics"};
    double[] quizMarks;
    String CourseName;
    private static int passLimit = 50;
    ArrayList<String> courseArrayList = new ArrayList<>();
    ArrayList<Integer> quiz = new ArrayList<>();

    public Student(String name, double[] quizMarks) {
        this.name = name;
        this.quizMarks = quizMarks;
        }


        public void RegCourse(){
        Scanner in = new Scanner(System.in);

            System.out.println("Register Course");
            courseArrayList.add("Maths");
            courseArrayList.add("Computer Science");
            courseArrayList.add("Physics");
            courseArrayList.add("English");
            //courseArrayList.add("History");

            System.out.println("Enter the course you want to add");
            CourseName = in.nextLine();
            courseArrayList.add(CourseName);
        }

    public void DropCourse(){
        Scanner in = new Scanner(System.in);

        displayCourse();
        //System.out.println("Removing Computer Science");
        //courseArrayList.remove("Computer Science");

        System.out.println("Enter the course you want to remove");
        CourseName = in.nextLine();
        courseArrayList.remove(CourseName);
    }

    public void displayCourse(){
        for (String cour: courseArrayList)
            System.out.println("Course: " + cour);
    }


    public void printInfo() {
        for (double elements : quizMarks)
            System.out.println("Quiz Marks: " + elements);

        System.out.println("\nTotal Courses: ");
        for (String cour: courseArrayList)
            System.out.println(cour);

    }

    public void getPassedQuizzes() {
        double marks;
        for (int i = 0; i < quizMarks.length; i++) {
            marks = quizMarks[i];
            if (marks > 50)
                System.out.println(marks);
        }

    }


}
