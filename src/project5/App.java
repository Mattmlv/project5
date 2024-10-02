package project5;

public class App {
//6.Create a class named App that has a main method.
	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        
        //Testing AsteriskLogger
        System.out.println("Testing AsteriskLogger:");
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        System.out.println();

        //Testing SpacedLogger
        System.out.println("Testing SpacedLogger:");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
		
		
	}

}
