import java.util.Scanner;
public class New{
  public static void main(String[] args) throws InterruptedException{
   Scanner sc = new Scanner(System.in);
    int start;
    System.out.print("How many number to countDown?: ");
    start = sc.nextInt();
    for(int i=start;i>0;i--){
      System.out.println(i);
      Thread.sleep(1000);

    }
    System.out.println("Happy Diwali!!");

  

    

  
  }
}
