import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        Random r = new Random();
        String filepath = "Words.txt";
        

        String word = "Pizza".toLowerCase();

        int wrongGuess = 0;


        ArrayList<Character> wordState = new ArrayList<>();
        for(int i = 0;i<word.length();i++){
            wordState.add('_');
        }



        while(wrongGuess<=6) {

            System.out.println(getHangManArt(wrongGuess));
            System.out.print("Word: ");
            for(char c:wordState){
                System.out.print(c+" ");
            }

            System.out.println();

            System.out.print("Enter a Guess: ");
            char guess = sc.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Right Guess");

                for (int i = 0; i < word.length(); i++) {

                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }

                }
                if(!wordState.contains('_')){
                    System.out.println("You Win");
                    System.out.println("The word is "+word);
                    break;
                }
            } else {
                System.out.println("Wrong Guess");
                wrongGuess++;
            }

        }
        if(wrongGuess>6){
            System.out.println(getHangManArt(wrongGuess=6));
            System.out.println("Out of Guesses");
            System.out.println("Word was: "+word);
        }


    }
    static String getHangManArt(int wrongGuess){
        return switch(wrongGuess){
            case 0 -> """
                    """;
            case 1->"""
                     o
                     
                    """;
            case 2 ->"""
                     o
                     |
                    """;
            case 3 ->"""
                      o
                    / |
                   """;
            case 4 ->"""
                      o
                    / | \\
                    """;
            case 5 ->"""
                      o
                    / | \\
                     /
                    """;
            case 6 -> """
                      o
                    / | \\
                     / \\
                    """ ;
            default ->" ";

        };
    }
}
