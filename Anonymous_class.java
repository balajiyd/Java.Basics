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
       Car c = new Car();
       Car c1 = new Car(){
           @Override
           void ride() {
               System.out.println("Mustang roars!!");
           }
       };
       c.ride();
       c1.ride();
       }
   }

public class Car {
    void ride(){
        System.out.println("You are Riding");
    }
}


