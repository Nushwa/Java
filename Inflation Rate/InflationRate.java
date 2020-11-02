/*
1.It is difficult to make a budget that spans several years, because prices are not stable. 
If your company needs 200 pencils per year, you cannot simply use this year’s price as the cost of pencils two years from now. 
Because of inflation, the cost is likely to be higher than it is today. Write a program to gauge the expected cost of an item in a 
specified number of years. The program asks for the cost of the item, the number of years from now that the item will be purchased, 
and the rate of inflation. The program then outputs the estimated cost of the item after the specified period. Have the user enter the inflation rate as a 
percentage, such as 5.6 (percent). Your program should then convert the percent to a fraction, such as 0.056, and should use a loop to estimate the 
price adjusted for inflation.

*/

import java.util.Scanner;

public class InflationRate {

    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        int year; //Number of years
        double costofItem = 0;
        double rate = 0; //Inflation Rate
        double Totalcost = 0; //Total Amount after inflation

        System.out.print("Enter the cost of the item: ");
        costofItem = in.nextDouble();

        System.out.print("Enter the number of years : ");
        year = in.nextInt();

        System.out.print("Enter the rate of inflation(In %): ");
        rate = in.nextDouble();
        rate = rate / 100;

        for (int i = 0; i < year; i++) { //estimate price after inflation

            //formula to calculate the cost of an item after specified years
            Totalcost = costofItem + (costofItem * rate);

        }
        System.out.printf("\nThe Cost of the item after %d years will be: $%.2f\n",year,Totalcost);

    }

}
