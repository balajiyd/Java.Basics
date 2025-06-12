//MAIN CLASS  
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
       Hawk h = new Hawk();
       Fish f = new Fish();
        r.flee();
        h.hunt();
        f.hunt();
        f.flee();


    }

}

//PREY(INTERFACE)
public interface Prey {

    void flee();


}
//PREDATOR INTERFACE
public interface Predator {
    void hunt();


}
//RABBIT
public  class Rabbit implements Prey {
@Override
public void flee(){
    System.out.println("The Rabbit is running away");
}




}

//HAWK
public class Hawk implements Predator{
      @Override
      public void hunt(){
          System.out.println("The Hawk is Hunting");
      }


    }

//FISH
public class Fish implements Prey,Predator {
 @Override
  public void flee(){
     System.out.println("The Fish is swimming away");
  }
  @Override
    public void hunt(){
      System.out.println("The fish is hunting");
  }

}


