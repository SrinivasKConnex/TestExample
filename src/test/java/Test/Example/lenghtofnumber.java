package Test.Example;

public class lenghtofnumber {

	public static void main(String[] args) {

		int num = 98765133;

		String len = String.valueOf(num);
		System.out.println(len.length());

		long count = 0;

		while (num > 0) {

			num /= 10;
			count++;
		}
		System.out.println(count);

	}
}
