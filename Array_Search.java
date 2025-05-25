import java.util.Scanner;
public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {2,4,6,8,10,12};
        String[] fruit = {"apple","banana","coconut","kiwi"};
        int target;
        String target1;
        boolean isFound = false;

        System.out.print("Enter the target element: ");
        target = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the target string: ");
        target1 = sc.nextLine();

        for(int i =0;i<numbers.length;i++){
            if(target==numbers[i]){
               System.out.println(" The target element found at index "+i);
               isFound = true;
               break;
            }
        }
        for(int i =0;i<fruit.length;i++){
            if(target1.equals(fruit[i])){
               System.out.println(" The target String found at index "+i);
               isFound = true;
               break;
            }
        }
        if(!isFound){
            System.out.println("Target not present in the Array.");
        }


    }
}

