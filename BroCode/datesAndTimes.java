import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time. format. DateTimeFormatter;

public class datesAndTimes {
    public static void main(String[] args) {
        
        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        // LocalDateTime dateTime = LocalDateTime.now();
        // Instant instant = Instant.now();
        // System.out.println(dateTime);
        // System.out.println(instant);


        // custom date time

        LocalDate date1 = LocalDate.of(2022,12,21);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2024,9,05);
        System.out.println(date2);

        if(date1.isBefore(date2)){
            System. out.println(date1 + " is earlier than " + date2);
        }
        else if(date1. isAfter(date2)){
            System. out.println(date1 + " is later than " + date2);
        }
        else if(date1. isEqual(date2) ){
            System. out.println(date1 + " is eqpal than " + date2);
        }
        LocalDateTime dateTime = LocalDateTime.of(2022,12,21,12,0,0);
        System.out.println(dateTime);

        LocalDateTime dateTime1 = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = dateTime1.format(formatter);  
        System.out.println(newDateTime);
        
    }
}
