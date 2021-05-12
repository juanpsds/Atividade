package string;

public class ToInginoreCase {

	public static void main(String args[]) {
		String str1 = "A";
		String str2 = "e";
		String str3 = "I";

		int result = str1.compareToIgnoreCase(str2);
		System.out.println(result);

		result = str2.compareToIgnoreCase(str3);
		System.out.println(result);

		result = str3.compareToIgnoreCase(str1);
		System.out.println(result);
	}

}
