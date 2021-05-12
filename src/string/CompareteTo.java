package string;

public class CompareteTo {

	public static void main(String args[]) {
		String str1 = "juan";
		String str2 = new String("gleidson");
		String str3 = new String("m");

		int result = str1.compareTo(str2);
		System.out.println(result);

		result = str2.compareTo(str3);
		System.out.println(result);

		result = str3.compareTo(str2);
		System.out.println(result);

		String str4 = "e";
		String str5 = "";
		String str6 = "gleidson";

		int result1 = str4.compareTo(str5);
		System.out.println(result);

		result = str5.compareTo(str6);
		System.out.println(result);

		result = str6.compareTo(str4);
		System.out.println(result);
	}
}
