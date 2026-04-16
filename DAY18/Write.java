import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try{
           // BufferedReader write=new BufferedReader(new FileReader("tesxt.txt"));
            FileWriter writer=new FileWriter("test.txt");
            writer.write("Write using FIlewriter");
            writer.close();
        } catch(IOException e){
            System.out.println(e.getMessage());    
        }
    }
}
