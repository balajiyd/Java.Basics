import java.util.*;

public class Main{
    public static void main(String[] args){
  ArrayList<Double> list= new ArrayList<>();
  list.add(3.2);
  list.add(1.3);
  list.add(2.2);
        System.out.println(list);

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.remove(0);
        fruit.set(1,"Pomegranate");
        fruit.set(2,"Pineapple");
        System.out.println(fruit);
        System.out.println(fruit.size());
        Collections.sort(fruit);
        System.out.println(fruit);

        for(String f: fruit  ){
            System.out.println(f);
        }
        //Add is a built-in method of arrayList
       
        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods= new ArrayList<>();
        System.out.println("Enter the number of Food you would like: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1;i<=n;i++){
            System.out.printf("Enter the food %d: ",i);
            String food = sc.nextLine();
            foods.add(food);

        }
        Collections.sort(foods);
        System.out.println(foods);

        sc.close();


    }
}
