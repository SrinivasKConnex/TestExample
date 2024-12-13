package Test.Example;



public class array {

	public static void main(String[] args) {

		int a[] = { 5, 8, 4, 10, 7 };

		int secondMax = a[0];

		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				secondMax = max;
				max = a[i];
			} else if (a[i] > secondMax && a[i] != max) {

				secondMax = max;
			}

		}
		System.out.println(secondMax);

	}
}
