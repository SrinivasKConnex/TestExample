package Test.Example;

public class countNumberofDigit {

	public static void main(String[] args) {

		int number = 110011;

		int count = 0;
		int rev = 0;
		while (number > 0) {
			// number%=10;
			rev = rev * 10 + number % 10;
			number /= 10;
			count++;
		}
		System.out.println(rev);
		System.out.println(count);
		System.out.println(rev!=number?"number in not palindrom":"number is palindrom");
	}
}
