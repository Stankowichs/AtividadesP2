import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        String checkinDate = sc.next();
        LocalDate checkin = LocalDate.parse(checkinDate, fmt);

        System.out.print("Check-out date (dd/MM/yyyy): ");
        String checkoutDate = sc.next();
        LocalDate checkout =  LocalDate.parse(checkoutDate, fmt);

        try {
            Reservation reservation1 = new Reservation(roomNumber, checkin, checkout);
            reservation1.printReservation();
        } catch(IllegalArgumentException e){
             throw e;
        }

        System.out.println("\nEnter data to update the reservation: ");

        System.out.print("Check-in date (dd/MM/yyyy): ");
        String newCheckinDate = sc.next();
        LocalDate newCheckin = LocalDate.parse(newCheckinDate, fmt);

        System.out.print("Check-out date (dd/MM/yyyy): ");
        String newCheckoutDate = sc.next();
        LocalDate newCheckout =  LocalDate.parse(newCheckoutDate, fmt);

        if(newCheckin.isBefore(checkin)){
            throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates");
        }

        try {
            Reservation reservation1 = new Reservation(roomNumber, newCheckin, newCheckout);
            reservation1.printReservation();
        } catch(IllegalArgumentException e){
            throw e;
        }

        sc.close();
    }
}