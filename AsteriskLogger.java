package codingAssignment;

public class AsteriskLogger implements Logger {

	public void Log(String log) {
		
		System.out.println("*** " + log + " ***");
	}

	public void Error(String error) {
		
		System.err.println("*******************" + "\n" + "*** " + error + " ***" + "\n" + "*******************" );
	}

	

}
