import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {

         String filePath = "C:\\Users\\Balaji.Y\\Desktop\\test.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Cant locate the file");

        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

    }
}
