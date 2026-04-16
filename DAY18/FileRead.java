import java.io.FileReader;
import java.io.IOException;
public class FileRead {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("test.txt");
            int character;
            while(fr.read()!=-1){
                character=fr.read();
                System.out.print((char)character);
            }       //Reads the file character by character and prints it on the console
            /*  Reads the file line by line and prints it on the console 
                It is faster than reading character by character
                BufferedReader fr=new BufferedReader(new FileReader("test.txt")); 
                String line;
                while((line=fr.readLine())!=null){
                    System.out.println(line);
                }
            */
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
