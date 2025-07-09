import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
     LocalDateTime dateTime = LocalDateTime.now();

     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
     String newDateTime = dateTime.format(formatter);
       System.out.println(newDateTime);

       LocalDateTime date1 = LocalDateTime.of(2024,11,15,12,11,33);
       LocalDateTime date2 = LocalDateTime.of(2025,01,1,0,0,0);
       System.out.println(date1);
       if(date1.isBefore(date2)){
           System.out.println(date1+" is earlier than "+date2);
       }
       else if(date1.isAfter(date2)) {
           System.out.println(date1+" is later than "+date2);
       }
       else if(date1.isEqual(date2)){
           System.out.println("The dates are equal");
       }
       }
   }

