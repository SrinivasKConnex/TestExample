package Test.Example;

public class printevenoddnumberfromArry {
	public static void main(String[] args) {

		int[] a = { 5, 9, 1, 3, 8, 4, 2, 5 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("even:" + a[i]);
				even++;
			}

		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("odd:" + a[i]);
				odd++;
			}
		}
		System.out.println("odd:" + odd + " even:" + even);

	}

}
