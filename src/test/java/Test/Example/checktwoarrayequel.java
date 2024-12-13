package Test.Example;

public class checktwoarrayequel {
	public static void main(String[] args) {

		int[] a = { 5, 9, 1, 3, 8, 4, 2, 5, 5 };
		int[] b = { 5, 9, 1, 3, 8, 4, 2, 10 };

		boolean status = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i]) {
					status = true;
				} else {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("array is equel");

		} else {
			System.out.println("arry is not equel");
		}

	}

}
