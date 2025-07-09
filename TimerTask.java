import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.TimerTask;


public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of sec to countdown: ");
       int response = sc.nextInt();
       Timer time = new Timer();
       TimerTask task = new TimerTask() {
           int  count = response;
           @Override
           public void run(){

               System.out.println(count);
               count--;
               if(count<0){
                   System.out.println("Happy Birthday");
                   time.cancel();
               }
           }
       };
       time.scheduleAtFixedRate(task, 0,1000);
       }
   }

