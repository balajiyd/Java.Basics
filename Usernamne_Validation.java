
import java.util.Scanner;


public class New{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String username;
    System.out.print("Enter a username: ");
    username = sc.nextLine();
    if((username.length()<4 || username.length()>12)){
      System.out.println("user name must be 4 to 12 characters.");
    }
    if(username.contains(" ") || username.contains("_") ){
      System.out.println("Invalid username!");
    }
    else{
      System.out.println("Valid username!!");
    }

    sc.close();
  }
}
