import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

class WriteToTextFile
{
public static void main(String[] args) throws IOException
{
    Files.write(Paths.get("C:/coder/core-java/output.txt"), "Hello Java 7".getBytes());
}
}