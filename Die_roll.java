import java.util.Random;
import java.util.Scanner;
public class New{
  static Scanner sc = new Scanner(System.in);
  static Random rd = new Random();
  public static void main(String[] args) {
      int numOfDice;
      System.out.print("Enter the number of dice you wanna roll: ");
      numOfDice = sc.nextInt();
      if(numOfDice>0){
        for(int i=0;i<numOfDice;i++){
          int roll = rd.nextInt(1,7);
          dieRoll(roll);
          System.out.println("You rolled: "+roll);
        }
      }
      else{
        System.out.println("enter a die value more than 0: ");
      }
    }
    static void dieRoll(int roll){
      
        String dice1 = """
               -------
               |     |
               |  ●  |
               |     |
               -------
        """;
        String dice2 = """
               -------
               | ●   |
               |     |
               |    ●|
               -------
        """;
        String dice3 = """
               -------
               | ●   |
               |  ●  |
               |    ●|
               -------
        """;
        String dice4 = """
               -------
               | ● ● |
               |     |
               | ● ● |
               -------
        """;
        String dice5 = """
               -------
               |●   ●|
               |  ●  |
               |●   ●|
               -------
        """;
        String dice6 = """
               -------
               | ●  ● |
               | ●  ● |
               | ●  ● |
               -------
        """;
        switch(roll){
          case 1 -> System.out.println(dice1);
          case 2 -> System.out.println(dice2);
          case 3 -> System.out.println(dice3);
          case 4 -> System.out.println(dice4);
          case 5 -> System.out.println(dice5);
          case 6 -> System.out.println(dice6);
          default -> System.out.println("Invalid Input");
        }
    }
  
  }



