import java.util.Scanner;
public class New{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    double balance=0;
    int choice;
    boolean isRunning=true;
    
    System.out.println("***************");
    System.out.println("BANKING PROGRAM");
    System.out.println("***************");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit money");
    System.out.println("3.Withdraw Money");
    System.out.println("4. Exit");
    

    while(isRunning){
      System.out.print("Enter your choice(1-4): ");
    choice = sc.nextInt();
     switch(choice){
      case 1 -> showBalance(balance);
      case 2 -> balance += deposit();
      case 3 -> balance -= withdraw(balance);
      case 4-> isRunning = false;
      default->System.out.println("Enter a valid choice");
     }
    }
    System.out.println("Thank You Bye!");

  }
static void showBalance(double b ){

    System.out.println(b);
  }
static double deposit(){

  double amount;
  System.out.print("Enter the amount to deposit:");
  amount = sc.nextDouble();
  if(amount<=0){
    System.out.println("The amount cannot be nagative");
    return 0;
  }
  else{
    return amount;
  }
}
static double withdraw(double balance){
   double amount;
  System.out.print("Enter the amount to Withdraw:");
  amount = sc.nextDouble();
  if(amount<=0 || amount>balance){
    System.out.println("The amount cannot be Withdrawn due to wrong input");
    return 0;
  }
  else{
    return amount;
  }
}
}


