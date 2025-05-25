import java.util.Scanner;
public class New{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String pizza = bakePizza("Flatbread","Mozzarella","Pepperoni");
   System.out.println(pizza);


}
static String bakePizza(String bread){
  return bread+" Pizza";
}
static String bakePizza(String bread, String cheese){
  return cheese+ " "+ bread+" Pizza";

}
static String bakePizza(String bread, String cheese,String topping){
  return topping+ " "+cheese+ " "+ bread+" Pizza";



}
}
