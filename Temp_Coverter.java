import java.util.Scanner;
public class New{
  public static void main(String[] args) {
    

      Scanner sc = new Scanner(System.in);

      double Temp;
      String choice;
      double newTemp;

      System.out.print("Enter the temperature: ");
      Temp = sc.nextDouble();
       sc.nextLine();

      System.out.print("Enter Celcius or Fahrenheit(C or F): ");
      choice = sc.nextLine().toUpperCase();

      newTemp = (choice.equals("C")) ? (Temp -32)*5/9 : (Temp*9/5)+32;
      System.out.println(newTemp);
       

      sc.close();

     
  

      
      
  }
}
