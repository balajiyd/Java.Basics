
import java.util.Random;
import java.util.Scanner;
public class New{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    Random rd = new Random();
    int min = 1,max = 101;
    int guess;
    int attempt=0;
    int RandomNumber = rd.nextInt(min,max);
    System.out.printf("Enter a number between %d-%d: \n",min,max);
    do { 
      System.out.print("Guess a number: ");
      guess = sc.nextInt();
      attempt++;
      if(guess>RandomNumber){
        System.out.println("The number is Higher.");
      }
      else if(guess<RandomNumber){
        System.out.println("The number is Lower.");
      }
      else{
        System.out.println("You Guessed the right number "+RandomNumber);
        System.out.println("The number of attempts you took are: "+attempt);
      }

        
    } while (guess != RandomNumber);

  

    

  
  }
}
