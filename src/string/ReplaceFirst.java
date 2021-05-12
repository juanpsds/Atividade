package string;

public class ReplaceFirst {
	
	 public static void main(String args[]) {
	      String Str = new String("juan pablo silva de souza juan");

	      System.out.print("a palavra foi substituida por : " );
	      System.out.println(Str.replaceFirst("(.*)juan(.*)", "gleidson"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.replaceFirst("juan", "gleidson"));
	   }

}
