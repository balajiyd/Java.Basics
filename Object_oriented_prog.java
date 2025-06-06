import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car myCar = new Car();
        System.out.println(myCar.isRunning);
        myCar.start();
        System.out.println(myCar.isRunning);
        myCar.stop();
        System.out.println(myCar.isRunning);
    }



}



public class Car {

    String make = "Porsche";
    String model = "911";
    int year = 2020;
    double price = 2400000;
   boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the Engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You Stop the Car.");
    }
    void drive(){
        System.out.println("You drive the "+make);
    }
    void brake(){
        System.out.println("You brake the "+model);
    }

}


