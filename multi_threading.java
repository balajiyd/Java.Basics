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
        Scanner sc= new Scanner(System.in);

        Thread t1 = new Thread(new MyRunnable("Ping"));
           Thread t2 = new Thread(new MyRunnable("Pong"));
           System.out.println("Game Start");
        t1.start();
           t2.start();
           try{
                     t1.join();
                     t2.join();
           }catch(InterruptedException e){
               System.out.println("Thread is interrupted");

           }
           System.out.println("Game Over");



       }
   }

// MyRunnable class that extends Runnable
public class MyRunnable implements Runnable{
    private final String text;

    MyRunnable(String text){
        this.text = text;
    }
    @Override
    public void run(){
        for(int i = 1;i<=5;i++){
            try{
                Thread.sleep(1000);

                System.out.println(text);
            }
            catch(InterruptedException e){
                System.out.println("Thread was Interrupted");
            }


        }
    }
}
