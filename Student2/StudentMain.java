/*
4.Define a class student with student name, registration number, degree program, department name, and CGPA as its attributes. 
Then, create a parametrized constructor to initialize these attributes, show method to display the information of a student, and a compare method 
to find out the student with highest CGPA. Write a Driver class and create 6 objects of a Student class, then display the detail of the student with highest CGPA.
*/

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        Student s1 = new Student("Anna", "FA18-BEE-032", "BEE" ,"Electrical Engineering", 3.21);
        Student s2 = new Student("Hamza", "FA18-BBA-065", "BBA" ,"Business Administration", 3.54);
        Student s3 = new Student("Alisha", "FA18-BCS-104", "BCS" ,"Computer Science", 3.15);
        Student s4 = new Student("Osman", "FA18-BCS-012", "BCS" ,"Computer Science", 2.68);
        Student s5 = new Student("Mustafa", "FA18-BSE-083", "BSE" ,"Software Engineering", 2.80);
        Student s6 = new Student("Maryam", "FA18-BSE-042", "BSE" ,"Software Engineering", 3.07);

        (s1.compare(s2.compare(s3.compare(s4.compare(s5.compare(s6)))))).displayinfo();
    }

}
