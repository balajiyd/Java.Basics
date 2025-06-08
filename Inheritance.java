//MAIN CLASS
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Dog dog = new Dog();
       Cat cat = new Cat();
       Plant plant = new Plant();
        System.out.println(dog.isAlive);
        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        System.out.println(plant.isAlive);
      dog.speak();
      plant.photosynthesize();

        
    }

  //ORGANISM CLASS(GRAND PARENT)
public class Organism{

  boolean isAlive;

  Organism(){
    isAlive =true;
  }




}
//PLANT CLASS
  public class Plant extends Organism{
   int lives =1;
 void photosynthesize(){
     System.out.println("The plant absorbs sunlight");
 }


}


  //ANIMAL CLASS 
  public class Animal extends Organism {
    void eats(){
        System.out.println("The animal eats");
    }






}

  //DOG CLASS
public class Dog extends Animal{
   int lives = 1;

    void speak(){
        System.out.println("The dog goes 'wooF!' ");

    }
}

  //CAT CLASS
  public class Cat extends Animal {

     int lives = 9;
    void eats(){
        System.out.println("The animal eats.");
    }
    void speak(){
        System.out.println("The cat goes 'MEOW!' ");

    }

}

  
  
