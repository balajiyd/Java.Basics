import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Friend f1 = new Friend("Spongebob");
        Friend f2 = new Friend("Spongebob");
        Friend f3 = new Friend("Spongebob");
        Friend f4 = new Friend("Spongebob");

        System.out.println(Friend.numOfFriends);


        
    }



}


public class Friend {
    String name;
    String email;
    int age;
    static int numOfFriends;


   Friend(String name){
       this.name  = name;
       numOfFriends++;
   }






}
