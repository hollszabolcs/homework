package Second;

public class ConsoleLogger implements ErrorLogger {
    @Override
    public void error(String text) {
        System.err.println("Error: " + text);
    }
}
