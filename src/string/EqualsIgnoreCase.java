package string;

public class EqualsIgnoreCase {

	public static void main(String args[]) {
		String Str1 = new String("juan pablo silva de souza");
		String Str2 = Str1;
		String Str3 = new String("juan pablo silva de souza");
		String Str4 = new String("JUAN PABLO SILVA DE SOUZA");
		boolean retVal;

		retVal = Str1.equals(Str2);
		System.out.println("os nomes sao iguais = " + retVal);

		retVal = Str1.equals(Str3);
		System.out.println("os nomes sao iguais = " + retVal);

		retVal = Str1.equalsIgnoreCase(Str4);
		System.out.println("os nomes sao iguais = " + retVal);
	}

}
