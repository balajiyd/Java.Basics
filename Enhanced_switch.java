import java.util.Scanner;
public class New{
  public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.print("Enter the day of the week: ");
String day = sc.nextLine();

switch(day){
  case "Monday","Tuesday","Wednesday","Thursday","Friday"->System.out.println("It is a weekday");
  case "Saturday","Sunday"->System.out.println("It is a weekend");
  default -> System.out.println("It is not a valid day");
}
      

      sc.close();

     
  

      
      
  }
}
