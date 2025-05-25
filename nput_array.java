import java.util.Scanner;
public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        sc.nextLine();

        String[] food = new String[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the food "+i+":");
            food[i] = sc.nextLine();
        }
        for( String items : food){
            System.out.print(items+ " ");
        }


    }
}

