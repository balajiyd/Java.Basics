import java.util.Scanner;
public class New{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    String name = "Balaji";
    String fname = "Balaji";
    String lname = "Yeddula";
    int age = 2;
    double  num = 3;
    happybirthday(name,age); //Argumements inside the bracket
       System.out.println(ageCheck(age));
    
    
    }
    static  void happybirthday(String name, int x){ //Parameters inside the brackets(they should have same data typer and order we receice the parameters)
       System.out.println("HappyBirthday to You!!");
        System.out.println("HappyBirthday to "+name+"!!");
         System.out.println("You are "+x+" years old!!");
          System.out.println("HappyBirthday to You!!");
    }
    static double square(double n){
      return n*n;
    }
    static double cube(double c){
      return c*c*c;
    }
     static String getFullName(String f, String l){
      return f+" "+l;
    }
    static boolean ageCheck(int age){
      if(age>=18){
        return true;
      }
      else{
        return false;
      }
    }
  
  }
