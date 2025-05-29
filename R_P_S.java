import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      Random r = new Random();

      String[] choice = {"rock","paper","scissors"};
      String computerChoice;
      String playerChoice;
      String playAgain;

      do{
          System.out.print("Enter your choice: ");
          playerChoice = sc.nextLine().toLowerCase();




          if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
              System.out.println("INVALID CHOICE");

          }else {
              computerChoice = choice[r.nextInt(3)];
              System.out.println("The computer's choice is: " + computerChoice);

              if (playerChoice.equals(computerChoice)) {
                  System.out.println("Its a TIE!!");
              } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                      playerChoice.equals("paper") && computerChoice.equals("rock") ||
                      playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                  System.out.println("You WIN!!!");
              } else {
                  System.out.println("YOU Fucking LOOSE!!!");
              }
          }
          System.out.print("Play again(yes/no)");
          playAgain = sc.nextLine().toLowerCase();

         }while(playAgain.equals("yes"));

        System.out.println("Thank You for playing");
    }
}
