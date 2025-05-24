import java.util.Scanner;
public class New{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String email = "balaji@gmail.com";
      String username = email.substring(0,email.indexOf("@"));
      String domain = email.substring(email.indexOf("@")+1);
      System.out.println(domain);
      
  }
}
