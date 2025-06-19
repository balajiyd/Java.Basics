import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number");
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This alwa");
        }


    }
}
