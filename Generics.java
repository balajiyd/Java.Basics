import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.TimerTask;


public class Main{
   public static void main(String[] args){
         Product<String, Double> p = new Product<>("apple", 3.8);
         Product<String, Integer> p1 = new Product<>("Ticket",22);
       System.out.println(p.getItem());
       System.out.println(p.getPrice());


       }
   }

// pRODUCT CLASS
public class Product <T,P>{
    T item;
    P price;

    public Product(T item,P price){
        this.item = item;
        this.price = price;
    }
    public T getItem(){
       return this.item;
    }
    public P getPrice(){
        return this.price;
    }
}

