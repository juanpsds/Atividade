package string;

public class EndsWith {

	public static void main(String args[]) {
		String Str = new String("gleidson");
		boolean retVal;

		retVal = Str.endsWith("batata");
		System.out.println("Returned Value = " + retVal);

		retVal = Str.endsWith("n");
		System.out.println("Returned Value = " + retVal);
	}

}
