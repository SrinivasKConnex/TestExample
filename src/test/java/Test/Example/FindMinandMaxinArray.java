package Test.Example;

public class FindMinandMaxinArray {
	public static void main(String[] args) {

		int[] a = { 55, 75, 12, 56, 32, 66 ,2};

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println(min);
	}

}
