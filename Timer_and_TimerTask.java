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
      Timer timer = new Timer();
      TimerTask task = new TimerTask(){
          int count = 3;
          @Override
          public void run(){

              System.out.println("Hello");
              count--;
              if(count<=0){
                  System.out.println("Task Complete");
                  timer.cancel();
              }
          }
      };
      timer.schedule(task, 3000, 1000);
       }
   }

