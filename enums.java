import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.TimerTask;


public class Main{
   public static void main(String[] args){
       System.out.print("Enter a day of the week: ");
       Scanner sc = new Scanner(System.in);
       String response = sc.nextLine().toUpperCase();


try {
    Day d = Day.valueOf(response);
    switch (d) {
        case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Its a weekday");
        case SATURDAY, SUNDAY -> System.out.println("Its a weekend");
    }
}
catch (IllegalArgumentException e){
    System.out.println("Enter a valid day");
}


       }
   }

// enum Day
public enum Day {

    SUNDAY(1),
    MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
    private final int dayNumber;
    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }
    public int getDayNumber(){
        return this.dayNumber;
    }
}

