import java.util.Scanner;
public class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] q = {"Where is Taj Mahal Located?",
                        "Capital of INDIA",
                        "National bird of new zealand",
                          "National Frit of India"};

         String[][] o = {{"1.Agra","2.Andhra","3.Arunachal","4.Finland"},
                          {"1.Hyderabad","2.Delhi","3.Punjab","4.Surat"},
                          {"1.Kiwi","2.Miwi","3. Diwi","4.Havi"},
                          {"1.Mango","2.Banana","3.Apple","4.Kiwi"}};
             
         int[] key = {1,2,1,1};
           int s=0;
      for(int i=0;i<q.length;i++){
        System.out.println(q[i]);
        for(String[] options:o){
            System.out.println(options[i]);
            
        }
        System.out.println("**********");
        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();

        if(guess == key[i]){
            System.out.println("*******");
            System.out.println("CORRECT");
            System.out.println("*******");
            s++;
        }
        else{
              System.out.println("*******");
            System.out.println("WRONG");
            System.out.println("*******");
        }
        System.out.print("The final score is "+s);

     }
        //Final Score

    }
}


