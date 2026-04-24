import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Read{
    public static void main(String[] args) throws IOException
    {

        byte[] bytes = Files.readAllBytes(Paths.get("C:/Users/saikr/OneDrive/Desktop/output.txt"));
        String content = new String(bytes);
        
        System.out.println(content);
    }
}