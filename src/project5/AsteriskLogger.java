package project5;
//3. Create two classes that implement the Logger interface.
public class AsteriskLogger implements Logger {
//4. Implement the AsteriskLogger methods.
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    public void error(String message) {
        String errorMessage = "***Error: " + message + "***";
        String border = "*".repeat(errorMessage.length());
        
        System.out.println(border);
        System.out.println(errorMessage);
        System.out.println(border);
    }
}
