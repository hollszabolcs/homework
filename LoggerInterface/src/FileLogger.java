import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileLogger implements Logger {
    @Override
    public void log(String messeage) {
        System.out.println("Please give a file name");
        String fileName=getText();
        System.out.println("please give me the saving path");
        String filePath=getText();
        System.out.println("Please give a message");
        messeage=getText();
        try (FileWriter writer = new FileWriter(filePath+fileName+".txt")) {
            writer.write(messeage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getText(){
        Scanner scanner=new Scanner(System.in);
        String text = scanner.nextLine();
        return  text;
    }
}
