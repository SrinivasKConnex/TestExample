package Test.Example;

public class prims {

	public static void main(String[] args) {

		int prime = 12;
		int count = 0;
		if (prime > 1) {
			for (int i = 1; i <= prime; i++) {
				if (prime % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("prime number");

			} else {
				System.out.println("not prime number");
			}

		} else {
			System.out.println("not a prime number");
		}
	}

}
