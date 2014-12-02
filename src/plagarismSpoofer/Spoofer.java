package plagarismSpoofer;

public class Spoofer {

	public static void spoof(String text)
	{
		text = text.replaceAll("e", "\0435");
		
		System.out.println(text);
		
	
	}
	
}
