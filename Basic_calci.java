import java.util.Scanner;
public class New{
  public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
 double number1,number2;
 String operator;
 System.out.print("Enter the first number");
 number1 = sc.nextInt();

  System.out.print("Enter your operator(+,-,/,*,^): ");
 operator = sc.next();

 System.out.print("Enter the second number");
 number2 = sc.nextInt();
 


switch(operator){
  case "+"->System.out.println(number1+number2);
  case "-"->System.out.println(number1-number2);
  case "/"->{
    if(number2 == 0){
      System.out.println("Cannot divide by zero!!");
    }
    else{
      System.out.println(number1/number2);
    }
  }

  case "*"->System.out.println(number1*number2);
  case "^"->System.out.println(Math.pow(number1,number2));

  default ->System.out.println("Enter a valid operator");
}
      

      sc.close();

     
  

      
      
  }
}
