//MAIN CLASS
import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.TimerTask;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // JAVA ALARM:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmtime = null;
        String filepath = "D:\\Uhalugusagusalade Video Song.wav";
        while (alarmtime == null) {
            try{
                System.out.print("Enter an alarm time: ");
                String time = sc.nextLine();
                alarmtime = LocalTime.parse(time,formatter);
                System.out.println("Alarm set for "+ alarmtime);
            }catch(DateTimeParseException e){
                System.out.println("Enetr a valid time. Use HH:MM:SS");
            }
        }

               Alarmy alarmClock  = new Alarmy(alarmtime,filepath,sc);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();



    }
}


// ALARM CLASS
import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Alarmy implements Runnable{
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner sc;
    Alarmy(LocalTime a, String filePath, Scanner sc ){
        this.alarmTime = a;
        this.filePath= filePath;
        this.sc = sc;
    }
    @Override
    public void run(){

         while(LocalTime.now().isBefore(alarmTime) ){
             try {
                 Thread.sleep(1000);
                 LocalTime now = LocalTime.now();


                 System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());
             }catch(InterruptedException e){
                 System.out.println("Thread is Interrupted.");
             }

         }
        System.out.println("\nALARM BUZZING..");
        Toolkit.getDefaultToolkit().beep();
        playSound(filePath);
    }
    private void playSound(String filePath){
        File audioFile = new File(filePath);

        try{
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press Enter to Stop the alarm");
            sc.nextLine();
            sc.close();
             clip.stop();

             sc.close();
        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio File format not supported");
        }
        catch(LineUnavailableException e){
            System.out.println(" Audio is Unavailable");
        }
        catch(IOException e){
            System.out.println("Error Reading Audio");
        }


    }

}
