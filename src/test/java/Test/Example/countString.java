package Test.Example;

public class countString {
	public static void main(String[] args) {

		String text = "aabcccddeeeeu";
		// out put a2b1c3d2e4
		int count = 1;

		StringBuffer replaceString = new StringBuffer();

		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i) == text.charAt(i - 1)) {
				count++;
			} else {
				replaceString.append(text.charAt(i - 1)).append(count);
				count = 1;
			}

		}
		replaceString.append(text.charAt(text.length() - 1)).append(count);
		System.out.println(replaceString);
	}

}
