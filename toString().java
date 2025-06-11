import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Car c = new Car("Ford", "Mustang",2023, "Red");

        System.out.println(c);

        System.out.println(c.make);


        
    }



}

// cAR Class

public class Car {

    String make;
    String model;
    int year;
    String colour;

    Car(String ma, String mod,int y, String co){
        this.make = ma;
        this.model = mod;
        this.colour = co;
        this.year = y;

    }
  @Override
    public String toString(){
      return this.colour+ " "+this.year + " "+this.make+" "+this.model;
  }


}
