package Test.Example;

public class sumOfDigit {

	public static void main(String[] args) {

		
		
		long num = 12345;
		long sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}

}
