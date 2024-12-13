package Test.Example;

public class reversNumber {
	public static void main(String[] args) {

		String s = "aabcddeeee";
		StringBuilder result = new StringBuilder();
		// a2b1c1d2e4
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				result.append(s.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		result.append(s.charAt(s.length() - 1)).append(count);
		System.out.println(result);

	}

}
