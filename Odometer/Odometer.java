import java.util.Scanner;

public class Odometer {

    private double miles; //instance variable
    private double fuel, gas;

    //Setter and Getter
    public void setFuel(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fuel efficiency: ");
        fuel = in.nextDouble();

    }

    public void setMiles(){
        double trip;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the miles:  ");
        trip = in.nextDouble();
        miles = miles + trip;
    }

    public double getMiles() {
        return miles;
    }

    public double getFuel() {
        return fuel;
    }

    public double getGas(){
        return miles/fuel;
  }
    public void setreset(){
        miles = 0;
    }


}
