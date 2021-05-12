package string;

public class Equals {

	public static void main(String args[]) {
		String str1 = new String("juan");
		String str2 = str1;
		String str3 = new String("gleidson");
		String str4 = new String("juan");
		boolean retVal = str1.equals(str2);
		System.out.println("as palavras sao = " + retVal);

		retVal = str1.equals(str3);
		System.out.println("as palavras sao = " + retVal);
		
		System.out.println("Batata");
		
		System.out.println("Vou verificar se juan é == a juan: " + (str1 == str4));
		System.out.println("Vou verificar se juan é == a juan: " + str1.equals(str4));
	}

}
