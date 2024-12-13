package Test.Example;

public class palindrom {
	public static void main(String[] args) {

		String text = "aabbaal";
		boolean ispalindrom = true;
		for (int i = 0; i < text.length(); i++) {
			ispalindrom = text.charAt(i) == text.charAt(text.length() - i - 1) ? true : false;
		}
		System.out.print(ispalindrom ? "palindrom" : "not a palindrom");

	}

}
