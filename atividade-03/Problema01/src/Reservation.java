import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private int roomNumber;
    LocalDate checkin;
    LocalDate checkout;

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(int roomNumber, LocalDate checkin, LocalDate checkout) {
        if (checkin.isAfter(checkout)) {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public long duration(){
        long duration = ChronoUnit.DAYS.between(checkin, checkout);

        return duration;
    }

    public void printReservation(){
        long duration = duration();
        System.out.print("Reservation: ");
        System.out.println("Room " + roomNumber + ", check-in: " + checkin.format(fmt) + ", check-out: "
                + checkout.format(fmt) + ", " + duration + " nights");
    }

}
