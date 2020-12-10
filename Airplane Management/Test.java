package Airplane Management;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Seat sp = new Seat("Nushwa", "35230-35324243-1", "18/12/2020", "Allama Iqbal Airport", "Karachi Airport", "One-Way");
        System.out.println("---------------Welcome To Airplane Reservation System-----------------");

        do {
            System.out.println("--------MENU-----------");
            System.out.println("1. Seat Pattern\n" +
                    "2. Seat Reservation\n" +
                    "3. Seat Cancellation\n" +
                    "4. Available Seats\n" +
                    "5. Reserved seats\n" +
                    "6. Search Reservation\n" + "7. Exit\n");

            choice = in.nextInt();


            if (choice == 1) {
                sp.displaySeat();
            } else if (choice == 2) {
                sp.seatReserve();
            }
            else if (choice == 3){
                sp.cancelReservation();
            }
            else if (choice == 4){
                sp.AvailableSeats();
            }
            else if (choice == 5){
                sp.ReservedSeats();
            }
            else if (choice == 6){
                sp.searchSeat();
            }
            else if (choice == 7){
                System.out.println("Thank you for your time.");
            }
            else {
                System.out.println("Wrong Input");
            }


        }while (choice != 7);
    }

}
