import java.util.Scanner;
public class New{
  public static void main(String[] args) {
    //Weight convertor;

      Scanner sc = new Scanner(System.in);
  System.out.println("Weight Coversion program");
  double weight;
  
  int choice;
  System.out.print("Enter 1 for kg to lbs and 2 for lbs to kg conversion: ");
  choice = sc.nextInt();
  if(choice == 1){
    System.out.print("Enter the weight in KG's: " );
    weight = sc.nextDouble();
    System.out.printf("TYour weight is %.2f lbs",weight*2.2);
  }
  else if(choice == 2){
     System.out.print("Enter the weight in lbs: " );
     weight = sc.nextDouble();
     System.out.printf("Your weight is  %.2f kgs",weight/2.2);
  }
  else{
    System.out.println("Enter a valid choice.");
  }

      
      
  }
}
