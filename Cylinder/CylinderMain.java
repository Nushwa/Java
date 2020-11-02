/*
Design a class Cylinder, which has following members:

 Data:

 radius
 height

 Constructor

 A no-argument constructor
 A one-argument constructor receiving height and setting radius to default value
1.5
 A one-argument constructor receiving radius and setting height to default value
2
 A two-argument constructor receiving height and radius
 A two-argument constructor receiving radius and height (watch the sequence)

 Methods:

 Setter functions (total 2)
 Getter functions (total 2)
 Overload setCylinderData method for i) no parameter; ii) one parameter
(height); iii) two parameter.
 computeArea
 computeVolume
 look for the relevant formulae over internet
 displayInfo

 Showing cylinder height, radius, area and volume

 Test class to test Cylinder
 Demonstrate all the above constructors/methods by creating different objects and
calling each constructor/method at least once
*/

import java.util.Scanner;

public class CylinderMain {

    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        // Creating Object (No argument constructor)
        Cylinder c1 = new Cylinder();

        //Creating object(1 argument) /height
        Cylinder c2 = new Cylinder(4.5);

        //Creating object (1 arg) / radius
        Cylinder c3 = new Cylinder(6);

        //Creating object(2 argument)
        Cylinder c4 = new Cylinder(8,2);

        //Creating object (2 argument) seq
        Cylinder c5 = new Cylinder(0.42, 1);

        System.out.print("Enter Radius: ");
        c1.setRadius(in.nextDouble());

        System.out.print("Enter Height: ");
        c1.setHeight(in.nextDouble());

        double r, h;
        r = c1.getRadius();
        h = c1.getHeight();

        System.out.println("\nUsing No Argument constructor");
        c1.displayInfo();

        System.out.println("\n\nUsing 1 Argument constructor setting height");
        c2.displayInfo();

        System.out.println("\n\nUsing 1 Argument constructor setting radius");
        c3.displayInfo();

        System.out.println("\n\nUsing 2 Argument constructor");
        c4.displayInfo();

        System.out.println("\n\nUsing 2 Argument constructor with sequence");
        c5.displayInfo();

        System.out.println("\n\n------After using Overload Methods------");
        c1.setCylinderData();
        c2.setCylinderData(4.6);
        c3.setCylinderData(1.2, 4);

        System.out.println("\nCylinder 1: ");
        c1.displayInfo();
        System.out.println("\n\nCylinder 2: ");
        c2.displayInfo();
        System.out.println("\n\nCylinder 3: ");
        c3.displayInfo();

    }
}
