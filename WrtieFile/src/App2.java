
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    
    public static void main(String[] args) throws IOException {
        int ch;

        FileReader fr = null;
        try {
            fr = new FileReader("output.txt");
        } catch (FileNotFoundException e) {
        }

        while ((ch=fr.read())!= -1) { 
            System.out.println((char)ch);
        }
        fr.close();
    }
}
