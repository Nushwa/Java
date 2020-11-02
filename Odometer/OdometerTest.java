/*
2.Define a class called Odometer that will be used to track fuel and mileage for an automobile. 
The class should have instance variables to track the miles driven and the fuel efficiency of the vehicle in miles per gallon. 
Include a setter method to reset the odometer to zero miles, a setter method to set the fuel efficiency, a setter method that accepts 
miles driven for a trip and adds it to the odometer’s total, and an getter method that returns the number of gallons of gasoline that the vehicle has 
consumed since the odometer was last reset.
Write a driver class with several trips with different fuel efficiencies. You should decide which variables should be public, if any.
*/


import java.util.Scanner;

public class Driver {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int choice;

        Odometer od1 = new Odometer();
        Odometer od2 = new Odometer();
        Odometer od3 = new Odometer();

        double o1, o2, o3;

        System.out.println("Enter Miles Driven on Trip 1: ");
        od1.setMiles();
        System.out.println("Enter Miles Driven on Trip 2: ");
        od2.setMiles();
        System.out.println("Enter Miles Driven on Trip 3: ");
        od3.setMiles();


       o1 = od1.getMiles();
       o2 = od2.getMiles();
       o3 = od3.getMiles();

       double f1, f2, f3;

        System.out.println("Set Fuel Efficiency for Car 1: ");
        od1.setFuel();
        System.out.println("Set Fuel Efficiency for Car 1: ");
        od2.setFuel();
        System.out.println("Set Fuel Efficiency for Car 1: ");
        od3.setFuel();


       f1 = od1.getFuel();
        f2 = od2.getFuel();
        f3 = od3.getFuel();



        double g1,g2,g3;

        g1 = od1.getGas();
        g2 = od2.getGas();
        g3 = od3.getGas();

        System.out.printf("\nOdometer 1: The miles driven by automobile is %.2f with %.2f gallons of gasoline and the fuel Efficiency of the vehicle is" +
                " %.2f\n", o1, g1, f1);
        System.out.printf("\nOdometer 2: The miles driven by automobile is %.2f with %.2f gallons of gasoline and the fuel Efficiency of the vehicle is" +
                " %.2f\n", o2,g2, f2);
        System.out.printf("\nOdometer 3: The miles driven by automobile is %.2f with %.2f gallons of gasoline and the fuel Efficiency of the vehicle is" +
                " %.2f\n", o3,g3, f3);


        System.out.print("Do you want to restart your trip:(-1 to end): ");
        choice = in.nextInt();

        while(choice != -1){
            od1.setreset();

            System.out.println("Enter Miles Driven on Trip: ");
            od1.setMiles();
            System.out.println("Set Fuel Efficiency for Car 1: ");
            od1.setFuel();

            o1 = od1.getMiles();
            f1 = od1.getFuel();
            g1 = od1.getGas();

            System.out.printf("\nThe miles driven by automobile after reset is %.2f with %.2f gallons of gasoline and the fuel Efficiency of the vehicle is" +
                    " %.2f\n", o1, g1, f1);

            System.out.print("Do you want to restart your trip:(-1 to end): ");
            choice = in.nextInt();
        }

    }
}
