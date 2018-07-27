package keerthana_automation.amazon;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String name = "Keerthana";
		int i;
		// char[] chrname=name.toCharArray();
		int a=name.compareToIgnoreCase("keerthana");
		String part=name.substring(0, 5);
		int bs=name.charAt(0);
		
		System.out.println(name.length());
		// System.out.println(chrname.length);
		for (i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		// System.out.println( "Hello World!" );
	}
}
