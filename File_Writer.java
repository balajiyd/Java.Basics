import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {

           String filePath = "C:\\Users\\Balaji.Y\\Desktop\\test.txt";
           String textContent = """
                             Roses are red
                             Violets are Blue
                            \s
                  \s""";
        try( FileWriter writer = new FileWriter(filePath);){
           writer.write(textContent);
            System.out.println("Has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't locate file location.");

        }
        catch(Exception e){
            System.out.println("Could'nt write file");
        }


    }
}
