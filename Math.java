import java.util.Scanner;
public class New{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    

    
    //Hypotenuse;
    double radius;
    double circumference,area,volume;
    /*System.out.print("Enter A: ");
    a = sc.nextInt();
    System.out.print("Enter B: ");
    b = sc.nextInt();
    */
    System.out.println("Enter Radius: ");
    radius = sc.nextInt();
    circumference = 2*Math.PI*radius;
    area = Math.PI*Math.pow(radius,2);
    volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
    
    System.out.printf("Circumference: %.1fcm",circumference);
      System.out.printf("Area: %.1fcm",area);
       System.out.printf(" Volume: %.1fcm",volume);
    





     

    
     
    




    

    
  }
}
