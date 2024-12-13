package Test.Example;

public class palindromNumbers {

	public static void main(String[] args) {

		String text = "madama";
		int start = 0;
		int end = text.length() - 1;
		boolean status = false;
		while (start < end) {
			if (text.charAt(start) != text.charAt(end)) {
				status = true;
			} else {
				status = false;
			}
			start++;
			end--;
		}

		System.out.println(status == true ? "String is not plandrom" : "String is plandrom");

	}

}
