package string;

public class ReplaceAllStringRegexStringReplacement {

	public static void main(String args[]) {
		String str = new String("juan pablo silva de souza juan");

		System.out.print("a palavra foi substituida por : ");
		System.out.println(str.replaceAll("(.*)juan(.*)", "AMROOD"));
	}

}
