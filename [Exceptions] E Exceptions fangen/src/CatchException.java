
public class CatchException
{
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufagbe 1
	public static int method1(ClassWithBuggyMethods obj)
	{
		try {
			return obj.getElement();
		} catch (Exception e) {
			return -1;
		}
	}
	
	// Aufgabe 2
	public static int method2(ClassWithBuggyMethods obj)
	{
		try {
			return obj.getLength();
		} catch (Exception e) {
			return -1;
		}
	}
	
	// Aufgabe 3
	public static String method3(ClassWithBuggyMethods obj)
	{
		try {
			obj.reallyRiskyMethod();
			return "";
		} catch (NullPointerException e) {
			return "NullPointerException aufgetreten";
		} catch (IndexOutOfBoundsException e) {
			return "Das haette nicht passieren duerfen";
		} catch (ClassCastException e) {
			throw new NumberFormatException();
		} catch (RuntimeException e) {
			return e.getMessage();
		}
	}
	
	//=================================
	// Ende des zu bearbeitenden Codes
	//=================================	
}
