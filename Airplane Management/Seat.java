import Airplane Management

import java.util.Scanner;

public class Seat {
    public char[][] seat = new char[10][4];
    private String name, CNIC, Date, Source, Destination, Way;
    Scanner input = new Scanner(System.in);

    String[] seats = new String[40];
    String seatNumber = " ";
    int count = 0;
    String q = " ";
    int numberOfSeatsAvailable = 0;
    int filled = 0;
    String DateBook = "3/12/2020";

    //Constructors
    public Seat() {
    }

    public Seat(String name, String CNIC, String date, String source, String destination, String way) {
        setName(name);
        setCNIC(CNIC);
        setDate(date);
        setSource(source);
        setDestination(destination);
        setWay(way);
    }

    // Getter And Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getWay() {
        return Way;
    }

    public void setWay(String way) {
        Way = way;
    }

    public String getDateBook() {
        return DateBook;
    }


    public void displaySeat() {

        //10 rows and 5 columns
        for (int i = 0; i < seat.length; i++) {
            seat[i][0] = 'A';
            seat[i][1] = 'B';
            seat[i][2] = 'C';
            seat[i][3] = 'D';
        }

        for (int i = 0; i < seat.length; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < seat[i].length; j++) {

                System.out.print(seat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void seatReserve() {
        System.out.println("Please enter the seat name for Reservation (e.g.- 1A): ");
        seatNumber = input.nextLine();
        count++;

        int row = seatNumber.charAt(0) - '1'; //will return the character at 0 index
        int col = seatNumber.charAt(1) - 'A';


        if (row < 0 || row >= 10 || col < 0 || col >= 4) {
            System.out.println("Input error. Enter seat to Reserve (e.g '1A'): ");
            seatNumber = input.nextLine();

            count++;
        }

        //If it is already reserved then display a message.
        if (seat[row][col] == 'X') {
            System.out.println("Apologies, The seat is already taken. Enter seat to reserve (e.g. 1A): ");
            seatNumber = input.nextLine();
            count++;
        }

        if (seat[row][col] != 'X') {

            seat[row][col] = 'X'; //Put X so that user knows that seat is taken
            filled++;
            System.out.println(" ");
            printSeats(seat);
        }
        System.out.println("CNIC: " + getCNIC() + "\nName: " + getName() + "\nDate of travelling: " + getDate() +
                "\nSource Airport: " + getSource() + "\nDestination Airport: " + getDestination()
                + "\nOne-Way or Return: " + getWay() + "\nDate of booking: " + getDateBook() +
                "\nThe Seat " + seatNumber + " is Reserved.");
    }


    private static void printSeats(char[][] seats)
    {

        for (int i = 0; i < seats.length; i++)
        {
            System.out.println((i + 1) + "  " +
                    seats[i][0] + " " + seats[i][1] + "  " + seats[i][2] + " " + seats[i][3]) ;

        }

    }

         public void AvailableSeats(){
             numberOfSeatsAvailable = (40 - count) ;
             System.out.println("There are " + numberOfSeatsAvailable + " seats available.") ;
             for (int i = 0; i < seat.length; i++){
                 System.out.print((i + 1) + " ");

                 for (int j = 0; j < seat[i].length; j++){
                     if (seat[i][j] != 'X'){
                         System.out.print(seat[i][j] + " ");
                     }
                     else
                         System.out.print("\t");
                 }
                 System.out.println();

             }
         }

         public void ReservedSeats(){
             System.out.println("There are " + filled + " seats Reserved.") ;
             for (int i = 0; i < seat.length; i++){
                 System.out.print((i + 1) + " ");

                 for (int j = 0; j < seat[i].length; j++){
                     if (seat[i][j] == 'X'){
                         char column = 'A';
                         switch (j){
                             case 1:
                                 column = 'B';
                                 break;
                             case 2:
                                 column = 'C';
                                 break;
                             case 3:
                                 column = 'D';
                                 break;
                         }
                         System.out.print(column + " ");
                     }
                     else
                         System.out.print(" ");
                 }
                 System.out.println();
             }
         }

         public void cancelReservation(){

             System.out.println("Enter seat to Cancel the Reservation.");
             seatNumber = input.nextLine();

             int row = seatNumber.charAt(0) - '1';
             int col = seatNumber.charAt(1) - 'A';

             if (seat[row][col] == 'X'){
                 for (int i = 0; i < seat.length; i++) {
                     for (int j = 0; j < seat[i].length; j++) {
                         seat[i][j] = 0;
                     }
                 }
             }
             else {
                 System.out.println("The Seat is not taken.");


             }
         }

    public String searchSeat(){
        System.out.println("Enter seat to search: ");
        seatNumber = input.nextLine();

        int row = seatNumber.charAt(0) - '1';
        int col = seatNumber.charAt(1) - 'A';

        if (seat[row][col] == 'X'){
            System.out.println("Apologies, The seat is not available.");
        }
        else
            System.out.println("The seat is found and it's available.");
        return "No seat available";
    }


}

