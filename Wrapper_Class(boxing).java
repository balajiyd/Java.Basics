import java.util.*;

public class Main{
    public static void main(String[] args){
     //AUTO-BOXING
    Integer a = 123;
    Double b = 3.14;
    Character c = '$';
    Boolean s = true;
    String e = "pizza";

    //UN-BOXING
        int x = a;
        double w = b;
        char r = c;
        Boolean k = s;

        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d= Boolean.toString(true);
     String x= a+b+c+d;
        System.out.println(x);

        int a = Integer.parseInt("123");
        Double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        Boolean d = Boolean.parseBoolean("true");

        System.out.println(b);

        char c = '@';
        System.out.println(Character.isAlphabetic(c));
        System.out.println(Character.isUpperCase(c));


    }
}
