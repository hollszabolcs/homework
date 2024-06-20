public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger filelogger = new FileLogger();
        consoleLogger.log("Test message");
        filelogger.log("Test message");
    }
}