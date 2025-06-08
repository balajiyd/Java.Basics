import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user4 = new User();
        User user2 = new User("Mahesh","mahesh@gmail.com");
        User user3 = new User("Babu", "babu@gmail.com", 44);


        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);



        
    }



}



//USER CLASS
public class User {
    String username;
    String email;
    int age;


    User(String name){
        this.username = name;
        this.email = "Not Provided";
        this.age = 0;
    }

    User(String name, String email){
        this.username = name;
        this.email = email;
        this.age = 0;
    }

    User(String name, String email, int a){
        this.username = name;
        this.email = email;
        this.age = a;
    }

    User(){
        this.username = "Man";
        this.email = "Not Provided";
        this.age = 0;
    }






}
