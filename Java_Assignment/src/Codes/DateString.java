package Codes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateString {

    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2013-08-22";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}