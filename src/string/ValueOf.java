package string;

public class ValueOf {

	public static void main(String args[]) {
		double d = 102939939.939;
		boolean b = true;
		long l = 1232874;
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		System.out.println("valor retornado : " + String.valueOf(d));
		System.out.println("valor retornado : " + String.valueOf(b));
		System.out.println("valor retornado : " + String.valueOf(l));
		System.out.println("valor retornado : " + String.valueOf(arr));
	}

}
