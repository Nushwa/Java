/*
Write a date class to model a date object.
 Date
 year
 month


 Constructors
 No argument constructor
 One parameterized constructor for setting all three fields (demonstrate the use
of this reference by using same names for parameters and instance variables)

 Methods
 A method to print date in “dd/mm/yy” format
 Implement the setter and getter methods for month only.

 Write DateTest class for the Date class
 Create two date objects d1 and d2 by calling constructors with appropriate values
 Input date, month and year from user using Scanner object and create two reference
variables (d3 and d4) of type date.
 Print d1, d2.
 Assign d2 to a new object d3 and d3 to d4
 Change d3 month through the setter methods
 Print d1, d2, d3 and d4 and observe the effect of reference types
*/

import java.util.Scanner;

public class DateTest {

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        Date d1 = new Date(14,"January", 2016);
        Date d2 = new Date(05,"November", 2011);
        Date d3 = new Date();
        Date d4 = new Date();

        String m;

        //Taking input from user for d3 and d3
        System.out.println("Enter Data for d3");
        System.out.print("Enter Day: ");
        d3.day = in.nextInt();

        in.nextLine();
        System.out.print("Enter Month: ");
        d3.setMonth(in.nextLine());
        m = d3.getMonth();

        System.out.print("Enter Year: ");
        d3.year = in.nextInt();

        System.out.println("Enter Data for d4");
        System.out.print("Enter Day: ");
        d4.day = in.nextInt();

        in.nextLine();
        System.out.print("Enter Month: ");
        d4.setMonth(in.nextLine());
        m = d4.getMonth();

        System.out.print("Enter Year: ");
        d4.year = in.nextInt();

        //Printing d1 and d2
        System.out.println("\n-----Displaying d1 Date-----\n");
        d1.display();
        System.out.println("\n-----Displaying d2 Date-----\n");
        d2.display();

        d2 = d3;
        d3 = d4;

        //Changing d3 month through setter
        d3.setMonth("September");

        System.out.println("\n-----After Edits-----\n");

        System.out.println("\n-----Displaying d1 Date-----\n");
        d1.display();
        System.out.println("\n-----Displaying d2 Date-----\n");
        d2.display();
        System.out.println("\n-----Displaying d3 Date-----\n");
        d3.display();
        System.out.println("\n-----Displaying d4 Date-----\n");
        d4.display();


    }
}
