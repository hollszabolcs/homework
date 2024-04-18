import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void log(String messeage) {
        try (FileWriter writer = new FileWriter("C:/log.txt")) {
            writer.write(messeage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
