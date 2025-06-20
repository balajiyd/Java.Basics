import javax.sound.sampled.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Uhalugusagusalade Video Song.wav";
        File file = new File(filePath);

        try(  Scanner sc = new Scanner(System.in);
              AudioInputStream a = AudioSystem.getAudioInputStream(file)){



            Clip c = AudioSystem.getClip();
           c.open(a);

           String Res = "";
           while(!Res.equals("Q")){
               System.out.println("P = Play");
               System.out.println("S = Stop");
               System.out.println("R = Reset");
               System.out.println("Q = Quit");
               System.out.print("Enter your choice");
               Res = sc.nextLine().toUpperCase();

               switch(Res){
                   case "P"->c.start();
                   case "S"->c.stop();
                   case "R"->c.setMicrosecondPosition(0);
                   case "Q"->c.close();
                   default-> System.out.println("Invalid choice");


               }
           }



        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't not locate file");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(IOException e){
            System.out.println("Somrthing went wrong");
        }
        finally{
            System.out.println("Bye");

        }

    }
}
