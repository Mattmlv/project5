package project5;
//3. Create two classes that implement the Logger interface.
public class SpacedLogger implements Logger {
    
//5.Implement the SpaceLogger methods.
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

    
    public void error(String message) {
        System.out.println("ERROR: " + addSpaces(message));
    }
    
    private String addSpaces(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            spacedMessage.append(c).append(" ");
        }
        return spacedMessage.toString().trim();
    }
}

