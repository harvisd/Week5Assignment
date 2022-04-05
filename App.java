package codingAssignment;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.Log("test string");
		System.out.println();
		logger.Error("test string");
		System.out.println();
		
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.Log("test string");
		System.out.println();
		spacedLogger.Error("test string");
		System.out.println();
	}



}
