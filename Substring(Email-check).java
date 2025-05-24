import java.util.Scanner;
public class New{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String email;
      String username;
      String domain;
      System.out.println("Enter your E-mail: ");
      email = sc.nextLine();
      username = email.substring(0,email.indexOf("@"));
      domain = email.substring(email.indexOf("@")+1);
      if(email.contains("@") && email.contains(".com")){
        System.out.println("Username is: "+username);
        System.out.println("Domain is: "+domain);
      }
      else{
        System.out.println("Invalid Email");
      }
      
  }
}
