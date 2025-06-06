import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 100;
        int payOut, bet;
        String[] row;

        System.out.println("*********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols🍒 🍉 🍋  ️🍰");
        System.out.println("*********************");


        while (balance > 0) {
            System.out.println("Current Balance : $" + balance);
            System.out.print("Place your bet amount: ");
            bet = sc.nextInt();
            sc.nextLine();
            if (bet > balance || bet <= 0) {
                System.out.println("That must be greater than 0 or not enough balance.");
                continue;
            } else {
                balance -= bet;

            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payOut =  getPayout(row, bet);

            if(payOut>0){
                System.out.println("You Won: $"+payOut);
                balance += payOut;
            }
            else{
                System.out.println("YOu Lost");
            }
            System.out.print("Do you want to playAgain(Y/N)?: ");
            String playAgain = sc.nextLine().toUpperCase();
            if(!playAgain.equals("Y")){
                break;
            }
        }
        System.out.println("Thanks for playing");
        sc.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍒", "🍉", "🍋", "🍰"};
        String[] row = new String[3];
        Random r = new Random();


        for (int i = 0; i < 3; i++) {
            row[i] = symbols[r.nextInt(0, 4)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🍰" -> bet * 5;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])){
             return switch(row[0]){
                    case "🍒" -> bet;
                    case "🍉" -> bet*2;
                    case "🍋" -> bet*3;
                    case "🍰"  -> bet*4;
                    default -> 0;

            };

        }
         else if (row[1].equals(row[2])){
            return switch (row[1]) {
                case "🍒" -> bet ;
                case "🍉" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍰" -> bet * 4;
                default -> 0;

            };
        }

          return 0;
    }
}
